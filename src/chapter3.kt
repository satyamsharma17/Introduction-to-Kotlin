// Constructor
// * Primary Constructor
class Person constructor (val name:String, val age:Int){

    //    Properties
    var gender:String = "Male"

    //    Member Function
    fun disc() {
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
    }

}

fun main() {
    val p1 = Person("Satyam", 19)
    p1.disc()
    println(p1.name)
    println(p1.age)
    println(p1.gender)

    val p2 = Person("Riya", 15)
    p2.gender = "Female"
    p2.disc()
    println(p2.name)
    println(p2.age)
    println(p2.gender)
}