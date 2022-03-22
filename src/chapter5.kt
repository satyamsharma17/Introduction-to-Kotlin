// Constructor
// * Secondary Constructor
class People {
//    Properties
    var gender:String = "Female"
//    var pName:String
    var name:String // For using same keyword for both variable and object.
    var pAge:Int

// Creating secondary constructor!
    constructor(name:String, age:Int) {
        println("Constructor called!")
        this.name = name // For using same keyword for both variable and object.
//      pName = name
        pAge = age
    }

//    Member Function
    fun disc() {
//      println("Name: $pName")
        println("Name: $name") // For using same keyword for both variable and object.
        println("Age: $pAge")
        println("Gender: $gender")
    }
}

fun main() {
    val p1 = People("Sonam", 28)
    p1.disc()
//  println(p1.pName)
    println(p1.name) // For using same keyword for both variable and object.
    println(p1.pAge)
    println(p1.gender)

    val p2 = People("Sita", 38)
    p2.disc()
}