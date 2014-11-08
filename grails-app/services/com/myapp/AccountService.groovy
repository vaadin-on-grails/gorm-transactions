package com.myapp

import grails.transaction.Transactional

@Transactional
class AccountService {

    void createUserWithAccount(String username, String password) {
        Account account = new Account()
        account.save(failOnError: true)

        User user = new User()
        user.username = username
        user.password = password
        user.account = account
        user.save(failOnError: true)

        // TODO: uncomment the following line to simulate failure during save, then nothing will be inserted into database
        // throw new RuntimeException("unexpected exception to simulate failure")
    }
}
