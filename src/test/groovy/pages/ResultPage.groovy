import geb.Page

class ResultPage extends Page {

    static at = { title == "BOM Search Results | Windchill Product Analytics" }

    static content = {
        searchResults { $("div#rdr_searchresults_widget") }
    }
}
