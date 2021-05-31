package com.dhinesh.oops

class Person{
    String firstName, lastName
    def dob
    // private | protected | public
    protected String f1,f2,f3
    private Date createdOn = new Date()
    static welcomeMessage = 'HELLO'

    public static final String WELCOME_MSG = 'HELLO'

    //local variables
    def foo() {
        String msg = 'Hello'
    }
}

println(Person.WELCOME_MSG)