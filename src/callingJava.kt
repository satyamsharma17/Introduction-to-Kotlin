// Calling Java from Kotlin
fun main() {
    val obj = createJava()
    obj.setValue(10)
    println(obj.getValue())

//    Can't access value of a because a variable in java class.
//    println(obj.a)
}