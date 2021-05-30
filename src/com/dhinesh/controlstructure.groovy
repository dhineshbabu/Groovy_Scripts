package com.dhinesh

if(true)
    println "This is true"

if(false)
    println "This is false"

String name = "null"

if(name)
    println "name has a value"

// while loop
def i =1
while (i <= 10) {
    println i
    i += 1
}

// for in list
def list = [1,2,3,4]
for( num in list ) {
    println num
}

//closure
def list2 = [1,2,3,4]
list2.each {println it}

//switch
def myNumber = 10
switch(myNumber) {
    case 1:
        println "Number is 1"
        break
    default:
        println "this is default case"
        break
}