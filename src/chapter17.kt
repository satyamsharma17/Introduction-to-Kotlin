// Interface
interface Father9 {
//    Properties
    var car:String // Abstract Property

//    Member Function
    fun disc() {
        println("Father Car: $car")
    }

    fun hello() // Abstract Method
}

class Son9:Father9 {
//    Properties
    var bike:String = "K 10"

//    Implementation of Father9()'s Abstract Property
    override var car:String = "Alto 800"

    override fun hello() {
        println("Hello Father9's Abstsract Method!")
    }

//    Member Fuction
    fun show() {
        println("Father Car: $car")
    }
}

fun main() {
    val s9 = Son9()
    s9.show()
    s9.disc()
    s9.hello()
}