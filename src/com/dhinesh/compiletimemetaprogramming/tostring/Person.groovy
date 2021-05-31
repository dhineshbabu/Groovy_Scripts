package com.dhinesh.compiletimemetaprogramming.tostring

import groovy.transform.ToString

@ToString(includeNames = true, excludes = ["email"])
class Person1 {

    String first
    String last
    String email

}

Person1 p = new Person1(first:"Dan",last: "Vega", email: "danvega@gmail.com")

println p.toString()