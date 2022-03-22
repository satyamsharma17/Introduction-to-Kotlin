import java.awt.LinearGradientPaint

// Class & Object
// Creating class!
class Mobile {
    // Properties
    var model: String = "100K"
    var price: Float = 555.55F

    // Member Function
    fun disc() {
        println("Model: $model")
        println("Price: $price")
    }
}

fun main() {
    val Lg = Mobile()    // Creating Object.
    Lg.disc()            // Calling Function Member using Object.
    Lg.model = "Lg K10"  // Accessing Properties using Object.
    Lg.price = 20000.45F // Accessing Properties using Object.
    Lg.disc()            // Calling Function Member using Object.

    val realme = Mobile()     // Creating Object.
    realme.model = "realme 2" // Accessing Properties using Object.
    realme.price = 5576.668F  // Accessing Properties using Object.
    realme.disc()             // Calling Function Member using Object.
}