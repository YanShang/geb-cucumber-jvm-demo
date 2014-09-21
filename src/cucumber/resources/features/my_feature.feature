Feature: BOM search in WPA

  Scenario: Search using Chrome
    When I am on the login page
	 And I log in with my credentials
	 And I follow the "Bill of Materials" link
     And I enter item number "SHN9663B"
     And I select region "Bom Source MotoPDM"
	 And I press the "Search" button
     And I select the search result "SHN9663B"
     And I follow the "Flat BOM" link	 
	Then I should see part number "0387347Y01"