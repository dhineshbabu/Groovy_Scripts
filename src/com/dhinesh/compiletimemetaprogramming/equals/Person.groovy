package com.dhinesh.compiletimemetaprogramming.equals

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode( excludes = ["email"] )
class Person1 {

    String first
    String last
    String email

}

Person1 p2 = new Person1(first:"Dan",last: "Vega", email: "danvega@gmail.com")
Person1 p1 = new Person1(first:"Dan",last: "Vega", email: "danvega133@gmail.com")

assert p1 == p2