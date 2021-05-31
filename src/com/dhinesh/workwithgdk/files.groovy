package com.dhinesh.workwithgdk

/*def file = new File('dummy.txt')
file.write("This is from a Groovy developer")

file.append("\nI am adding one more line")

List lines = file.readLines()
lines.each { line ->
    println(line)
}*/

new File('.').eachFile{ file ->
    if(file.name.endsWith('.groovy')) {
        println(file.name)
    }
}
