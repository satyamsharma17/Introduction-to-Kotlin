// Inheritance with Primary Constructor
open class Father1(_car:String, _money:Int) {
    //    Property
    var car:String = _car
    var money:Int = _money

    //    Member Function
    fun disc() {
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son1(_car:String, _money:Int, _bike:String):Father1(_car, _money) {
    //    Properties
    var bike:String = _bike

    //    Member Function
    fun show() {
        println("Son Bike: $bike")
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

fun main() {
    val s1 = Son1("Lambo", 949, "BMW")
    s1.show()
    s1.disc()
    s1.car = "ZSV"
    s1.money = 5767
    s1.bike = "K 67"
    s1.show()
}