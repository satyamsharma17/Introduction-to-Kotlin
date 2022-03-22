// Visibility Modifiers
// private: It means visible inside this class only (including all its members).
// protected: It is same as private but is also visible in subclasses.
// internal: It means that any client inside this module who sees the declaring class sees its internal members.
// public: It means that any client who sees the declaring class sees its public members.

open class Father6 {
// Properties
    private var a:Int = 10
    protected var b:Int = 20
    internal var c:Int = 30
    var d:Int = 40

//    Member Function
    fun disc() {
        println("A: $a")
        println("B: $b")
        println("C: $c")
        println("D: $d")
    }

    protected fun hello() {
        println("Hello Father!")
    }
}

class Son6:Father6() {
//    Properties
    var bike:String = "K 10"

//    Member Function
    fun show() {
// Can't access as its private.
//        println("A: $a")
        println("B: $b")
        println("C: $c")
        println("D: $d")
        hello()
    }
}

fun main() {
    val s6 = Son6()
    s6.show()
    s6.disc()
//    s6.a = 101
//    s6.b = 102
    s6.c = 103
    s6.d = 104
    s6.show()
//    Can't access as its protected.
//    s6.hello()

    val f6 = Father6()
//    Can't access as its private.
//    f6.a = 110

//    Can't access as its private.
//    f6.b = 111

//    Can't access as its protected.
//    f6.hello()
    f6.disc()
}

// Visibility Modifier for Constructor!
class Father7 private constructor(a:Int) {

}