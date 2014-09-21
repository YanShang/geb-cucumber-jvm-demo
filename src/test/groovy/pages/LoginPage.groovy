import geb.Page

class LoginPage extends Page {

    static at = { title == "Login | Windchill Product Analytics" }

    static content = {
        loginForm { $("form") }
        loginButton(to: HomePage) { loginForm.Submit() }
    }
}
