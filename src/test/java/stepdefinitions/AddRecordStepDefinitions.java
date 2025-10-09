package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddRecordPage;

import java.util.List;

public class AddRecordStepDefinitions {

    AddRecordPage addRecordPage;
    List<List<String>> lists;

    @When("enter data")
    public void enter_data(DataTable dataTable) {
        addRecordPage = new AddRecordPage();

        lists = dataTable.asLists();
        for (List<String> eachList : lists) {
            System.out.println(eachList);
            addRecordPage.enterName(eachList.getFirst());
            addRecordPage.enterAge(eachList.get(1));
            addRecordPage.selectCountry(eachList.getLast());
            addRecordPage.clickAddRecord();
        }
    }

    @Then("assert added records")
    public void assert_added_records() {
        AddRecordPage addRecordPage = new AddRecordPage();

        for (List<String> eachList : lists) {
            String name = eachList.get(0);
            addRecordPage.assertTableContainsText(name);

        }
    }


}
