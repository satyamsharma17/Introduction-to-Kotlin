// Constructor
// * Primary Constructor
class Human (name:String, age:Int){

// Properties
    var hName:String
    var hAge:Int = age // We can initialize variable here it as well.
    var hGender:String = "Male"

// Initializer Block

    init {
        hName = name
    }

// Member Function
    fun disc() {
        println("Name: $hName")
        println("Age: $hAge")
        println("Gender: $hGender")
    }

}

fun main() {
    val h1 = Human("Satyam", 36)
//    Changing the predefined value of property.
//    h1.hGender = "Female"
    h1.disc()

    val h2 = Human("Suraj", 68)
    h2.disc()
}