// Super Keyword
open class Father5 {
    //    Property
    open var car:String = "Audi"
    var money:Int = 1000

    //    Member Function
    open fun disc() {
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son5:Father5() {
    //    Properties
    var bike:String = "K 10"
    override var car:String = "BMW"
    var fCar:String = super.car

    //    Member Function
    fun show() {
        println("Son Bike: $bike")
        println("Son Car: $car")
        println("Father Car: $fCar")
        println("Father Money: $money")
    }

    override fun disc() {
        println("Son class displayed!")
    }
}

fun main() {
    val s4 = Son5()
    s4.show()
    s4.disc()

    val f5 = Father5()
    f5.disc()
}