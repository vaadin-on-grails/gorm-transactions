package app

import com.myapp.Account
import com.myapp.AccountService
import com.myapp.User
import com.vaadin.grails.Grails
import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener
import com.vaadin.ui.Button
import com.vaadin.ui.VerticalLayout

class AccountView extends VerticalLayout implements View {

    static final String VIEW_NAME = "account"

    @Override
    void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

        Button btn = new Button("Create account")
        btn.addClickListener(new Button.ClickListener() {
            @Override
            void buttonClick(Button.ClickEvent clickEvent) {
                AccountService accountService = Grails.get(AccountService)

                try {
                    accountService.createUserWithAccount('test', 'password')
                } catch (Exception e) {
                    println "failed: ${e.message}"
                }

                println Account.findAll()
                println User.findAll()
            }
        })

        addComponent(btn)
    }
}