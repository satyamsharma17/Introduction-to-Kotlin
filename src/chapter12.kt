// Inheritance with Primary & Secondary Constructor
open class Father3(_car:String, _money:Int) {
    //    Property
    var car:String = _car
    var money:Int = _money

    //    Member Function
    fun disc() {
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son3:Father3 {
    //    Properties
    var bike:String

    //    Secondary Constructor
    constructor(_car:String, _money:Int, bike:String):super(_car, _money) {
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
    val s3 = Son3("Lambo", 949, "BMW")
    s3.show()
    s3.disc()
//    s3.car = "ZSV"
//    s3.money = 5767
//    s3.bike = "K 67"
//    s3.show()
}