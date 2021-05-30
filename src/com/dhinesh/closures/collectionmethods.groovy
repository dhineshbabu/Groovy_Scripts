package com.dhinesh.closures

List favNums = [2,3,43,4,5]

for(num in favNums) println(num)

favNums.each {println(it)}

favNums.eachWithIndex{ num, int idx -> println("$idx, $num")}

List days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
List WeekEnd = days.findAll {it.startsWith("S")}
println(WeekEnd)

// collect
List nums = [1,2,2,7,2,8,2,4,6]

List numsTimesTen = []

nums.each {
    num -> numsTimesTen << num * 10
}
println(numsTimesTen)

List newTimesTen = nums.collect{num -> num*10}
println(newTimesTen)