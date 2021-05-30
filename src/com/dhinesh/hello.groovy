package com.dhinesh

import groovy.xml.MarkupBuilder

println "Hello World"

def xml = new MarkupBuilder()

//assert false

def x = [1,2,3,4,5,6]
println(x<<6)