import geb.Page

class SearchPage extends Page {

    static at = { title == "Search for Bill of Material | Windchill Product Analytics" }

    static content = {
        searchForm { $("form#search") }
        itemNumber { searchForm.find("textarea", name:"searchFieldsWithDelimiterSupport[\'partNumber\']") }
        region { searchForm.find("select", name:"searchRegions") }
        searchButton { searchForm.find("input.button", value:"Search") }
    }
}
