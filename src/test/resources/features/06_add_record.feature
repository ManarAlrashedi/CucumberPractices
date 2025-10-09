Feature: Add Record

  @AddRecord
  Scenario: Add Record Scenario
    Given user visits "https://claruswaysda.github.io/addRecordWebTable.html"
    When enter data
      | John  | 15 | Germany   |
      | Mary  | 25 | Canada    |
      | Tom   | 25 | UK        |
      | Kevin | 30 | USA       |
      | Bob   | 10 | Australia |
      | Hans  | 40 | Germany   |
      | Sam  | 15 | Germany   |
      | Nona  | 25 | Canada    |
      | Taif   | 25 | UK        |
      | Ahmad | 22 | USA       |
      | Hana   | 13 | Australia |
      | Saja  | 60 | Germany   |
      | Samar  | 15 | Germany   |
      | Tala  | 35 | Canada    |
      | Lara   | 39 | UK        |
      | Hada  | 40 | Germany   |
      | Sama  | 33 | Germany   |
      | Noha  | 25 | Canada    |
      | Saad   | 25 | UK        |
      | Amer | 30 | USA       |
      | Hala   | 13 | Australia |
      | Sajoo  | 42 | Germany   |
      | Samher  | 15 | Germany   |
      | Talal  | 35 | Canada    |
      | Manar   | 25 | UK        |
    Then assert added records
    Then close browser
