/**
 * Example of writing custom application-specific steps
 */

import pages.*

import static cucumber.api.groovy.EN.*


Given(~/I am on the login page/) { ->
    to LoginPage
}

When(~/^I log in with my credentials$/) { ->
    at LoginPage
    page.loginForm.j_username = "xxx"
    page.loginForm.j_password = "xxx"
    page.loginButton.click()
}

Then(~/^I follow the "([^\"]*)" link$/) { String linkText ->
    page.find("a", text:linkText).click()
}

Then(~/^I enter item number "([^\"]*)"$/) { String itemNumber ->
    at SearchPage
    page.itemNumber = itemNumber
}

Then(~/^I select region "([^\"]*)"$/) { String region ->
    at SearchPage
    page.region.find("option", text:region).click()
}

Then(~/^I press the "([^\"]*)" button$/) { String name ->
    page.find("input.button", value:name).click()
}

Then(~/^I select the search result "([^\"]*)"$/) { String name ->
    at ResultPage
    page.searchResults.find("a", text:name) << org.openqa.selenium.Keys.ENTER
    at BomInfoPage
    $("a", text:"Flat BOM").size() == 1	
}

Then(~/^I should see part number "([^\"]*)"$/) { String partNumber ->
    $("span", text:"Flat BOM").size() == 1
    $("div", text:partNumber).size() == 1 
}

Then(~/the first heading on the page is '(.*)'/) { String expectedHeading ->
    assert page.headings[0].text() == expectedHeading
}

When(~/the link to the cross browser page is clicked/) { ->
    page.crossBrowserLink.click()
}
