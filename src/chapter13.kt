// Overriding Properties & Functions
open class Father4 {
    //    Property
    open var car:String = "Audi"
    var money:Int = 1000

    //    Member Function
    open fun disc() {
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son4:Father4() {
    //    Properties
    var bike:String = "K 10"
    override var car:String = "BMW"

    //    Member Function
    fun show() {
        println("Son Bike: $bike")
        println("Father Car: $car")
        println("Father Money: $money")
    }

    override fun disc() {
        println("Son class displayed!")
    }
}

fun main() {
    val s4 = Son4()
    s4.show()
    s4.disc()

    val f4 = Father4()
    f4.disc()
}