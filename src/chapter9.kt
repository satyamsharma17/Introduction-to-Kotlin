// Inheritance
open class Father {
//    Property
    var car:String = "Audi"
    var money:Int = 1000

//    Member Function
    fun disc() {
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son:Father() {
//    Properties
    var bike:String = "K 10"

//    Member Function
    fun show() {
        println("Son Bike: $bike")
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Daughter:Father() {
//    Properties
    var bike:String = "KT9"

//    Member Function
    fun show() {
        println("Daughter Bike: $bike")
        println("Daughter Car: $car")
        println("Daughter Money: $money")
    }
}

fun main() {
    var f1 = Father()
//    f1.disc()

    val s1 = Son()
//    s1.show()
//    s1.disc()
    s1.car = "ZSV"
    s1.money = 5767
    s1.bike = "K 67"
//    s1.show()
//    s1.disc()

    var d1 = Daughter()
    d1.bike
    d1.show()
    d1.disc()
}