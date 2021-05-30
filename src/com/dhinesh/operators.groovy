package com.dhinesh

/*@Grapes (
        @Grab(group='org.apache.commons', module='commons-lang3', version='3.4')
)

import org.apache.commons.lang3.text.WordUtils
String name = "Dhinesh Babu Muthuraj"
WordUtils wordUtils = new WordUtils()
println(wordUtils.initials(name))*/

//elvish operator

def somename = true ?: 'defaultname'
println somename

def somename1 = false ?: 'defaultname'
println somename1

// safe navigation operator

/*
Person p = new Person()

def address = p?.address // if address is null then will as null instead of throwing NPE
assert address == null
* */



