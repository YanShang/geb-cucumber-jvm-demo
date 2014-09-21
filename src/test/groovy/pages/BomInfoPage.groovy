import geb.Page

class BomInfoPage extends Page {

    static at = { title == "BOM Information | Windchill Product Analytics" }

    static content = {
        flatBomTab{ $("span", text:"Flat BOM") }
    }
}
