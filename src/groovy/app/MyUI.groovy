package app

import com.vaadin.navigator.Navigator
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.UI

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        Navigator navigator = new Navigator(this, this)

        navigator.addView(AccountView.VIEW_NAME, AccountView)

        navigator.navigateTo(AccountView.VIEW_NAME)
    }
}
