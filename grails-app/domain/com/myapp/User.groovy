package com.myapp

class User {

    String username
    String password

    static belongsTo = [account: Account]

    static constraints = {
    }
}
