package com.dhinesh

def c1 = 'c' // this is also a string in groovy
println(c1.class)

// String interpolation
String name = "dhineh"
String msg = "Hello $name"  // if we evaluate an expression then usr ${} with double quotes
println(msg)

//Multilline
def alargeMessage = """
fsfsf
sfd
sfsdfs
"""

// escaping
def folder = $/C:/groovy/somefolder/$
println(folder)