package com.dhinesh

@groovy.transform.ToString()
class Developer {
    String first
    String last
    def languages = []

    void work() {
        println "This is from Developer classs ${first} ${last} and the languages ${languages}"
    }
}

Developer d = new Developer()
d.first = "Dhinesh"
d.setLast("babu")
d.languages << "Groovy"
d.languages << "Java"

d.work()

