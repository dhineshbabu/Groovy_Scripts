package com.dhinesh.closures

//implicit parameters
def foo = {
    println(it)
}

foo("dhinesh")

// no params
def noparams = {
    println "no params"
}
noparams()

def sayHello = {
    first, last ->
        println("Hello $first, $last")
}
sayHello("Dhinesh", "babu")

// default values
def greet ={String name = "dhinesh", String greeting ->
    println " Hello $name $greeting"
}
greet("kanu") // groovy automaticaly identifies where to replace the default

//var args
def concat = {String...args ->
    args.join("-")
}

println(concat("3434", "3434", "34556"))

def someMethod(Closure c) {
    println("...")
    println(c.maximumNumberOfParameters)
    println(c.parameterTypes)
}

def someClosure = { int x, int y -> x+y }

someMethod(someClosure)