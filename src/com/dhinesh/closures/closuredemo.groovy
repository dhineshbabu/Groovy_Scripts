package com.dhinesh.closures

def c = {}
println(c.class.name)


def sayHello = { name ->
    println("Hello $name")
}

sayHello('Dhinesh')

List nums = [1,2,3,4,5]

nums.each {println(it)}
//closures are objects & last param

def timesTen(num, closure) {
    closure(num * 10)
}

timesTen(10, {println(it*20)})

10.times {println(it)}

Random rand = new Random()
3.times{println(rand.nextInt())}