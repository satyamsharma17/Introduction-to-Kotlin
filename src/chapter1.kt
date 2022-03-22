import java.util.*

// Main Function
// An entry point of a Kotlin application is the main function.

fun wemain(){
    print("Hello Kotlin!")
}

fun memain(args:Array<String>){
    print("Hello Kotlin!")
}

// Single Line Comment
/*
Multi
Line
Comment
*/

// Data Types
// Int: 10, 20, 100
// Long: 154499895L, 54487878L
// Float: 142.36F, 1.2F
// Double: 424546545.6546, 1.2
// Char: 'M', 'F'
// String: "Hello", "Hello Kotlin", "123456"
// Boolean: true, false

// Variable
// # var - Variables that can be reassigned.
// # Dynamic Type
fun youmain(){
    var roll = 10
    roll = 20
    var mobileNumber = 5990000000L
    var price = 80.25F
    var totalCost = 848465456.545
    var gender = 'F'
    var name = "Satyam"
    var isActive = true
    println(roll)
    println(mobileNumber)
    println(price)
    println(totalCost)
    println(gender)
    println(name)
    println(isActive)
}

// # Specific Type
fun notmain(){
    var roll:Int = 10
    var mobileNumber:Long = 84848484L
    var price:Float = 8.2F
    var totalCost:Double = 9898.65
    var gender:Char = 'F'
    var name:String = "Satyam"
    var isActive:Boolean = true

    println(roll)
    println(mobileNumber)
    println(price)
    println(totalCost)
    println(gender)
    println(name)
    println(isActive)

}

// # val - Read-only local variables are defined using the keyword val. They can be assigned a value using only once.
// # Dynamic Type
fun usmain(){
    val roll = 10
    val mobileNumber = 5990000000L
    val price = 80.25F
    val totalCost = 848465456.545
    val gender = 'F'
    val name = "Satyam"
    val isActive = true
    println(roll)
    println(mobileNumber)
    println(price)
    println(totalCost)
    println(gender)
    println(name)
    println(isActive)
}

// # Specific Type
fun whymain(){
    val roll:Int = 10
    val mobileNumber:Long = 84848484L
    val price:Float = 8.2F
    val totalCost:Double = 9898.65
    val gender:Char = 'F'
    val name:String = "Satyam"
    val isActive:Boolean = true

    println(roll)
    println(mobileNumber)
    println(price)
    println(totalCost)
    println(gender)
    println(name)
    println(isActive)

}

// Print Function
// print() & println()
fun whatmain(){
    println("Hello Kotlin!")
    println(10)
    println(10 + 20)
    val a = 10
    println(a)
    println("Value is " + a + "!")
    println("Value is $a!")
    val b = 20
    println("Numbers are $a & $b!")
    println(a + b)
    println("Value is ${a+b}.")
    print("Value is ${a+b+10}.")

}

// Arithmetical Operation
fun whenmain() {
    val a = 5
    val b = 2
//  val result = a + b
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)
    println(b..a)
    for (i in b..a)
    {
        println(i)
    }
}

// Comparison Operator
fun hemain() {
    val a = 5
    val b = 2
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
}

// Equality & Inequality Operator
fun shemain() {
    val a = 5
    val b = 2
    println(a == b)
    println(a != b)
}

// Logical Operators
// && Operator - True when both conditions are true and false when any one condition is false.
fun itmain() {
    val a = 30
    val b = 20
    val c = 10
//    println( (a > b) && (b > c) )
//    println( (a < b) && (b > c) )
//    println( (a < b) && (b < c) )
//    println( (a > b) && (b < c) )

// || Operator - True when any one condition is true and false when any both the conditions are false.

//    println( (a > b) || (b > c) )
//    println( (a < b) || (b > c) )
//    println( (a < b) || (b < c) )
//    println( (a > b) || (b < c) )

    println(!(a<b))
    println(!(a<b))
}

// Increment & Decrement Operators
fun theymain() {
    var a = 5
    println(++a)
    println(a)
    println(a++)
    println(a)

    println(--a)
    println(a)
    println(a--)
    print(a)
}

// Augmented Assignments & Assignment Operator
fun whomain() {
    var a = 10
    a = a + 5
    a += 5
    a -+ 5
    a *= 5
    a /= 5
    a %= 5
    print(a)
}

// User Input
// # Using readLine() which takes only String as input.

fun onlymain() {
//    val name = readLine()
//    println("Enter your name:")
//    val name: String? = readLine()
//    println(name)
//    println(name!!::class.simpleName)

    print("Enter your name: ")
    val name = readLine()
    println("Your name is $name.")
    println(name!!::class.simpleName)

// Type Casting
// # From string to integer.

    print("Enter your roll number: ")
    val roll = readLine()!!.toInt()
    println("Your roll number is $roll.")
    println(roll!!::class.simpleName)

// # From string to float.

    print("Enter your fee: ")
    val fee = readLine()!!.toFloat()
    println("Your fee is $fee.")
    println(fee!!::class.simpleName)
}

// Using Scanner Class
fun manymain() {
    print("Enter your name: ")
    val scanner = Scanner(System.`in`)
    val name = scanner.next()
    println("Your name is $name.")
    println(name::class.simpleName)

    print("Enter your roll number: ")
//    val scanner = Scanner(System.`in`)
    val roll = scanner.next().toInt()
    println("Your roll number is $roll.")
    println(roll::class.simpleName)

    print("Enter your fee: ")
//    val scanner = Scanner(System.`in`)
    val fee = scanner.next().toFloat()
    println("You fee is $fee.")
    println(fee::class.simpleName)
}

// String - String are immutable. Once you initialize a string, you can't change its value or assign a new value to it. All operations that transform strings return their results in a new String object, leaving the original string unchanged.
fun howmain() {
    val str = "Hello"
    println(str)
    println(str[0])
    println(str[1])
    println(str[2])
    println(str[3])
    println(str[4])
}

// # String Concatenation
fun totalmain() {
    val str1 = " Hello"
    val str2 = " Kotlin"
    println(str1 + str2)
    println("This is" + str1 + str2 + ".")
//    Correct Concatenation: You can concatenate a string to integer.
    println("100" + 50)
//    Wrong Concatenation: You can not concatenate a integer to string.
//    println(50 + "100")
}

// # String Literals
// * Escaped String
fun extramain() {
    println("Hello\nWorld!")
    println("Hello\tWorld!")
}

// * Raw String
fun messagemain() {
    val message = """Dear Sir/Madam, 
I would like to request you kindly watch my youtube videos.""".trimIndent()
    println(message)
}

// # String Templates
fun stringmain() {
//    val str = "Kotlin"
//    println(str)
//    println("This is " + str + ".")
//    println("This is $str.")

//    val cart = 10
//    println("Cart = $cart")

//    val str1 = "Hello"
//    var str2 = "Kotlin"
//    println("This is $str1 $str2.")

    val a = 10
    val b = 20
//    Wrong Method
//    println("Addition = $a + $b")

//    Correct Method
    println("Addition = ${a + b}")
    println("Addition = ${a + b + 50}")

    val name = "Satyam"
    println("How are you ${name.toUpperCase()}?")
}

// if Expression - if is an expression: it returns a value.
fun ifmain() {
     if (10 > 5) {
         println("This is if expression.")
     }
     if (10 < 5) {
         println("This is if expression.")
     }

    val a = 20
    val b = 10
    var max = 0
    if(a < b)
    max = a
    println(max)

    if (a > b) {
        println("This is kotlin if expression.")
        println("Max number is $a.")
    }
}

// if else Expression
fun elsemain() {
//    if (10 > 5){
//        println("Inside if!")
//    }  else {
//        println("Inside else!")
//    }

    val a = 20
    val b = 10
    var max = 0

//    if(a < b) {
//        println("A = $a")
//    } else {
//        println("B = $b")
//    }

     if(a > b) {
         max = a
     } else {
         max = b
     }
    println(max)

//    max = if(a < b) {
//        a
//    } else {
//        b
//    }
//    println(max)

    max = if(a < b) a else b
    println(max)

    max = if(a > b) a else b
    println(max)
}

// when Expression
fun switchmain() {
    val x = 2
//    when(x) {
//        1 -> print("One")
//        2 -> print("Two")
//        3 -> print("Three")
//        4 -> print("Four")
//        5  -> print("Five")
//        else -> print("Not valid!")

//    when(x) {
//        1, 2  -> print("One or Two")
//        3 -> print("Three")
//        4 -> print("Four")
//        5 -> print("Five")
//        else -> print("Not valid!")

//    when(x) {
//        1, 2  -> {
//            print("One")
//            print("Two")
//        }
//        3 -> print("Three")
//        4 -> print("Four")
//        5 -> print("Five")
//        else -> print("Not valid!")
//    }

//    when(x) {
//        in 1..4 -> {
//            print("One")
//            print(" Two")
//            print(" Three")
//            print(" Four")
//        }
//        5 -> print("Five")
//        else -> print("Not valid!")
//    }

    when("Sunday") {
        "Saturday", "Sunday" -> print("Holiday!")
        "Monday" -> print("Workday!")
    }
}

// for Loop
// Syntax: for (item in collection) print(item)
fun formain() {
//    for (item in 1..5) println(item)
//    for (item in 1..5) {
//        println("Step: $item")
//        println(item)
//    }

    for (item in 5 downTo 1) {
        println("Step: $item")
//        println(item)
    }
}

// while Loop
fun whilemain() {
    var x = 0
    while (x < 5) {
        x++
        println(x)
    }

    while (true) {
        println("Always true!")
    }
}

// do while Loop
fun dowhilemain() {
    var x = 0
//    do {
//        x++
//        println(x)
//    } while (x < 5)

    do {
        x++
        println(x)
    } while (true)
}

// Break and Continue
fun breakmain() {
    var x = 0
//    while (x < 10) {
//        x++
//        if (x == 5) break
//        println(x)
//    }

    while (x < 10) {
        x++
        if (x == 5) continue
        println(x)
    }
}

// Function - Kotlin functions are declared using the fun keyword.
// * Function without parameters!
fun withmain() {
//    disc() // Calling disc() function!
//    disc() // Calling disc() function!
//    val total = add() // Calling add() function!
//    println(total)
//    var multiplication = multi() // Calling multi() function!
//    println(multiplication)
//    println("After function.")
}

//fun disc() {
//    println("Hello Kotlin!")
//}

//fun add(): Int { // Return type Int!
//    val a = 10
//    val b = 20
//    return (a + b)
//}

//fun multi(): String { // Return type String!
//    val a = 10
//    val b = 20
//    return ("Multiplication: ${a*b}")
//}

// * Functions with parameters!
fun funmain() {
//    disc(10, 20) // Calling disc() function!
//    disc(30, 40) // Calling disc() function!
//    val total = add(5, 10) // Calling add() function!
//    val otherTotal = add(50, 10) // Calling add() function!
//    println(total)
//    println(otherTotal)
//    var multiplication = multi(60, 10) // Calling multi() function!
//    println(multiplication)
//    println("After function.")
}

//fun disc(x:Int, y:Int) {
//    println("Values are $x and $y.")
//}

//fun add(x:Int, y:Int): Int { // Return type Int!
//    val a = x
//    val b = y
//    return (a + b)
//}

//fun multi(x:Int, y:Int): String { // Return type String!
//    return ("Multiplication: ${x*y}")
//}

// * Functions with default arguments.
//fun defaultmain() {
//    val total = add(10)
//    println(total)
//}

//fun add(x:Int, y:Int = 50):Int {
//    return (x+y)
//}

// * Functions with named argument.
//fun namedmain() {
//    val total = add(y = 10, x = 20) // Using named argument!
//    println(total)
//}

//fun add(x:Int, y:Int):Int {
//    println("x: $x")
//    println("y: $y")
//    return (x+y)
//}

// * Higher Order Function
//fun main() {
//    hOf(10, 20, ::add)
//}
//
//fun add(a:Int, b:Int):Int {
//    return (a + b)
//}
//
//fun hOf(a:Int, b:Int, callback: (Int, Int) -> Int) {
//    println(callback(a, b))
//}

// * Lambda Expression
fun lambdamain() {
//    val add = { a:Int, b:Int -> a + b }
//    println(add(10, 20))
//
//    val sum:(Int, Int) -> Int = { a, b -> a + b }
//    println(sum(20, 40))
//    hOf(10, 20) { a: Int, b: Int -> a + b }
}

//fun hOf(a:Int, b:Int, callback: (Int, Int) -> Int) {
//    println(callback(a, b))
//}

// * Anonymous Function
fun anonymousmain() {
    val add = fun(a:Int, b:Int):Int {
        return a + b
    }
    println(add(10, 20))

    val disc = fun() {
        println("hello!")
        println("kotlin!")
    }
    disc()
}

// Null Safety
fun nullmain() {
    var name1:String = "Neha" // Non-null by default.
//    name1 = null // Null not allowed!
    var name2:String? = "Rahul" // Allow null.
//    name2 = null // Null not allowed!
//    var name2:String = "Rahul" // Not allowed null.

//    var name1Length = name1.length
//    println(name1Length)

//    var name2Length = name2.length
//    println(name2Length)
//
//    Option 1: Check null in condition.
//    val name2Length = if(name2 != null) name2.length else -1
//    println(name2Length)

//    Option 2: Safe Call
//    val name2Length = name2?.length
//    println(name2Length)

//    Option 3: The !! Operator
//    The not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null.
//    val name2Length = name2!!.length
//    println(name2Length)
}

// Array
// * arrayOf()
fun arraymain() {
    val data = arrayOf("Satyam", "Sumit", "Rahul", 100, 'M')
//    println(data[0])
//    println(data[1])
//    println(data[2])
//    println(data[3])
//    println(data[4])

//    for (item in data) {
//        println(item)
//    }

    val names = arrayOf<String>("Satyam", "Sumit", "Rahul")
//    println(names[0])
//    println(names[1])
//    println(names[2])

//    for (item in names) {
//        println(item)
//    }

// For changing the value of String at particular index.
//    names[2] = "Kunal"

//    for (item in names) {
//        println(item)
//    }

// For setting the value of String at particular index.
//    names.set(1, "Jay")
//    for (item in names) {
//        println(item)
//    }

//    val one = names[0]
//    println(one)

//    val zero = names.get(0)
//    println(zero)

// Will throw error: ArrayIndexOutOfBoundException
//    names[3] = "Sameer"
//    for (item in names) {
//        println(item)
//    }

// Loop Array and their Index!
//    for (name in names) {
//        println(name)
//    }

// For printing indexes of the String element present in the array.
//    for (i in names.indices) {
//        println(i)
//    }

// For printing indexes with the particular names of that index.
//    for (i in names.indices) {
//        println("$i: ${names[i]}")
//    }

//    println(names.size)

// For printing indexes with the particular name of that index using size property of array!
//    for (i in 0..names.size-1) {
//        println("$i: ${names[i]}")
//    }

//    val s = names.size

// After assigning the names.size in a variable.
//    for (i in 0..s-1) {
//        println("$i: ${names[i]}")
//    }

//    names.forEach { name -> println(name) }
}

// * Array Constructor
fun constructormain() {
//    val roll = Array(5, { i -> i * 2})
//    for (no in roll) {
//        println(no)
//    }
}

// * Built-in Methods
fun builtmain() {
//    val roll = intArrayOf(101, 103, 105)
//    for (no in roll) {
//        println(no)
//    }

//    val gender = charArrayOf('M', 'C')
}

// * User Input Array
fun usermain() {
//    print("Enter number of students: ")
//    val num = readLine()!!.toInt()
//    println("Enter students name: ")
//    val students = Array(num) { readLine()!! }
//    for (student in students) {
//        println(student)
//    }
}

// List: List is an ordered collection with access to elements by indices - integer numbers that reflect their position. Elements can occur more than once in a list.
fun listmain() {
//    val data = listOf("Satyam", "Sumit", "Pulkit", 100, 'M', "Satyam")
//    println(data)

//    println(data[0])
//    println(data[1])
//    println(data[2])
//    println(data[3])
//    println(data[4])
//    println(data[5])

// For printing String element of a particular index.
//    println(data.get(4))

// For printing all the elements of the data array.
//    for (no in data) {
//        println(no)
//    }

// Getting size of the data array.
//    println(data.size)

// Loop Array and their Index!
//    for (no in data) {
//        println(no)
//    }

// For printing indexes of the String element present in the array.
//    for (i in data.indices) {
//        println(i)
//    }

// For printing indexes with the particular names of that index.
//    for (i in data.indices) {
//        println("$i: ${data[i]}")
//    }

// Getting size of the data array.
//    println(data.size)

// For printing indexes with the particular name of that index using size property of array!
//    for (i in 0..data.size-1) {
//        println("$i: ${data[i]}")
//    }

//
//    val s = data.size

// After assigning the names.size in a variable.
//    for (i in 0..s-1) {
//        println("$i: ${data[i]}")
//    }

//    data.forEach { no -> println(no) }

// After setting array type.
//    val names = listOf<String>("Satyam", "Rahul", "Sonam")
//    println(names)

// mutableListOf()
//    val names = mutableListOf("Satyam", "Rahul", "Sonam", 'M', 100, "Satyam")
//    println(names[0])
//    println(names[1])
//    println(names[2])
//    println(names[3])
//    println(names[4])
//    println(names[5])

//    println(names.get(4))

//    for (no in names) {
//        println(no)
//    }

//    println(names.size)

// Updating String element at 0 index.
//    names[0] = "Jay"
//    println(names)

// Adding String element at 1 index.
//    names.add(1, "Jack")
//    println(names)

//    println(names.size)

// Removing String element at 1 index.
//    names.removeAt(1)
//    println(names)
//    println(names.size)

    val names = mutableListOf<String>("Satyam", "Rahul", "Sumit")
    println(names)
}

// * User Input List
fun userlistmain() {
    print("Enter number of students: ")
    val num = readLine()!!.toInt()
    println("Enter students name: ")
    val students = List<String>(num) { readLine()!! }
    for (student in students) {
        println(student)
    }
}

// Set is a collection of unique elements. It reflects the mathematical abstraction of set: A group of objects without repetitions. Generally, the order of set elements has no significance.
fun setmain() {
//    val data = setOf("Satyam", "Rahul", "Sumit", 100, 'M', "Sumit")
//    println(data)

//    for (no in data) {
//        println(no)
//    }

//    println(data.size)

//    val names = setOf<String>("Sonam", "Rahul", "Sumit", "Sonam", "Rahul")
//    println(names)

//    val names = mutableSetOf("Satyam", "Rahul", "Sumit", 100, 'M', "Sumit")
//    println(names)

//    for (no in names) {
//        println(no)
//    }

//    names.add("Kunal")
//    println(names)

//    names.remove("Kunal")
//    println(names)

//    val names = mutableSetOf<String>("Satyam", "Rahul", "Sumit")
//    println(names)
}

// Map or Dictionary: It is set of key-value pairs. Keys are unique, and each of them maps to exactly one value. The values can be duplicates. Maps are useful for storing logical connections between objects. For example: An employee's ID and their position.
fun main() {
//    val data = mapOf(1 to "Satyam", "Sumit" to "Rahul", "Kunal" to "Neha", "Harsh" to 100)

//    println(data)

//    println(data[1])
//    println(data["Sumit"])
//    println(data["Kunal"])
//    println(data["Harsh"])

//    println(data.get(1))

//    println(data.keys)
//    println(data.values)

//    println("All keys: ${data.keys}")

//    for (key in data.keys) {
//        println(key)
//    }

//    println("All values: ${data.values}")

//    for (value in data.keys) {
//        println(value)
//    }

//    for (key in data.keys) {
//        println("$key: ${data[key]}")
//    }

//    println(data.size)

//    val names = mapOf<String, String>("Sumit" to "Rahul", "Kunal" to "Neha")
//    println(names)

//    val data = mutableMapOf(1 to "Satyam", "Sumit" to "Rahul", "Kunal" to "Neha", "Harsh" to 100)
//    println(data)

//    println(data[1])
//    println(data["Sumit"])
//    println(data["Kunal"])
//    println(data["Harsh"])

//    println(data.get(1))

//    for (key in data.keys) {
//        println("$key: ${data[key]}")
//    }

//    println(data.size)

    val names = mutableMapOf<String, String>("Sumit" to "Rahul", "Kunal" to "Neha", "Karan" to "Kavita")
    println(names)

    names["Sumit"] = "Jay" // Update
    println(names)

    names["Satyam"] = "Lalita" // Add
    println(names)

    names.put("Sumit", "Aryan") // Update
    println(names)

    names.remove("Sumit") // Remove
    println(names)

    names.keys.remove("Kunal") // Remove elements by key.
    println(names)

    names.values.remove("Lalita") // Remove elements by value.
    println(names)
}