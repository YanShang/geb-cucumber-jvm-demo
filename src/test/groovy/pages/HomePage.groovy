import geb.Page

class HomePage extends Page {

    static at = { title == "Welcome to Windchill Product Analytics. | Windchill Product Analytics" }

    static content = {
        searchLinks { $('.menuBox') }
    }
}
