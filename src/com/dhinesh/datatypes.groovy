package com.dhinesh

//Groovy specific data types - def may change
def x = 10
println x.class

x = "change to string"
println x.class

//if we know the type wont change, it is not recommended to use def/
// BigDecimal is the default decimal type in java


def myFloat = 10.55
println ((int) myFloat)

29.times {
    print '-'
}

1.upto(10) {
    num -> print num
}

10.downto(1) {
    num -> println num
}

0.step(1, 0.1) {
    num -> println num
}