// Inheritance with Secondary Constructor
open class Father2 {
    //    Property
    var car:String
    var money:Int

//    Secondary Constructor
    constructor(car:String, money:Int) {
    this.car = car
    this.money = money
}

    //    Member Function
    fun disc() {
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son2:Father2 {
    //    Properties
    var bike:String

//    Secondary Constructor
    constructor(car:String, money:Int, bike:String):super(car, money) {
    this.bike = bike
}

//    Member Function
    fun show() {
        println("Son Bike: $bike")
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

fun main() {
    val s2 = Son2("Lambo", 949, "BMW")
    s2.show()
    s2.disc()
    s2.car = "ZSV"
    s2.money = 5767
    s2.bike = "K 67"
    s2.show()
}