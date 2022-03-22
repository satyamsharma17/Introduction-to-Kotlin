// Abstract Class & Abstract Method
abstract class Father8 {
//    Properties
    var car:String = "Alto 800"

//    Member Function
    fun disc() {
        println("Father Car: $car")
    }

//    Abstract Method
    abstract fun hello()
}

class Son8:Father8() {
//    Member Function
    fun show() {
        println("Father Car: $car")
    }

//    Implementation of Father8's Abstract Method
    override fun hello() {
        println("Hello Father8's Abstract Method!")
    }
}

fun main() {
    val s8 = Son8()
    s8.show()
    s8.disc()

    s8.hello()

//    Can't create object of Father8() class because its an abstract class.
//    val f8 = Father8()
//    f8.disc()
}