package com.dhinesh.collections

def map = [:]  // LinkedHashMap is the default implementation
println(map)
println(map.getClass().getName())

def person = [first: "Dan", last: "Dhinesh", email: "Dhinesh@dhines.com"]
println(person)
println(person.last)

person.twitter = "@dksljsdklfjkl"
println(person)

def twitter = [username: "dhinesh", email: "dsdsd@gmail.com"]
println(person.size())
println(person.sort())

//looping maps
for(entry in person) {
    println(entry)
}

for(key in person.keySet()) {
    println(key)
}