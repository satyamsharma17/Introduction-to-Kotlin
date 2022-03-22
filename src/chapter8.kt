// Getter & Setter
class User(_id: Int, _name: String, _age: Int) {

    val id:Int = _id
    get() = field

    var name:String = _name
    get() = field
    set(value) {
        field = value
    }

    var age:Int = _age
        get() = field
        set(value) {
            field = value
    }
}

fun main() {
    val u1 = User(1, "Sonam", 21)
    println(u1.id) // Get property!
    println(u1.name) // Get property!
    println(u1.age) // Get property!

    u1.name = "Rahul"
    u1.age = 39

    println(u1.name) // Get property!
    println(u1.age) // Get property!
}

