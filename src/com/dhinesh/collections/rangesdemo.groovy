package com.dhinesh.collections

Range r = 1..10
println(r)
println(r.from)
println(r.to)
println(r.class)
// Range is interface and IntRange is implementation

//exclusive range excluding 10
Range r1 = 1..<10

assert (0..10).contains(0)

Date today = new Date()
Date oneWeekAway = today + 7
println(today)
println(oneWeekAway)

Range days = today..oneWeekAway
println(days)

//String range
Range letters = 'a'..'z'
println(letters)