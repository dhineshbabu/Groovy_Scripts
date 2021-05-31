@groovy.transform.ToString
class Person1 {

    String first,last

    // constructor
    Person1(String fullName) {
        List parts = fullName.split(' ')
        first = parts[0]
        last = parts[1]
    }

    // methods
    public void foo(String a, String b) {
        // do stuff
    }

    String getFullName(){
        "$first $last"
    }

    def bar(){

    }

    static String doGoodWork(){
        println "doing good work..."
    }

    List someMethod(List numbers = [1,2,3], Boolean canAccessAll = false ){

    }

    def concat(String... args) {
        println args.class.name
        println args.length
    }

}

// Person1 p = new Person1(first:'Dan',last:'Vega')
// println p

//Person1 p = new Person1("Dan Vega")
//println p

Person1 p = new Person1("Dan Vega")
p.concat('a','b','c','d')