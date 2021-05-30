package com.dhinesh
import groovy.transform.Immutable

@Immutable
class Customer {
    String first, last
    int age
    Date since
    Collection favItems
}

def d = new Date()
def c1 = new Customer("Dhinesh", "babu", 21, d, ["Books", "Coding"])

// The below will throw error due to Immutable annotation
c1.first = "newUser"