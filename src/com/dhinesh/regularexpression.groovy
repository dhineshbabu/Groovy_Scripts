package com.dhinesh

// find operator (=~)
// match operator (==~)
// pattern operator (~string)

String slashy = /a\b/
String url = $/http://threaldanvega.com/blog/$

def pattern = ~/a\b/
println(pattern.class)

//Find and Match
def text = " This is from dhinesh portfolio and to be matched by a pattern"
def pattern1 = ~/dhinesh portfolio/
def finder = text =~ pattern1
def matcher = text ==~ pattern1
println(finder)
println(finder.size())
println(matcher)

text = text.replaceFirst(pattern1, "kanu")
println(text)
