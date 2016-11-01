/**
 * Created by lean on 16/4/20.
 */

//define a function
fun sum(a: Int, b: Int): Int {
    return a + b
}

//function with an expression body and inferred return type
fun sum1(a: Int, b: Int) = a + b

//Unit corresponds to the `void` type in Java.
fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}

//Unit can be omitted.
fun printSum1(a: Int, b: Int) {
    print(a + b)
}

//read-only local variable
fun variable(): Unit {
    //read-only
    val a: Int = 1
    //mutable
    var b: Float = 1.0F
    b = 2.0F
}

// when expressions.
fun cases(obj: Any) {
    when (obj) {
        1 -> print("one")
        "Hello" -> print("Greeting")
        is Long -> print("Long")
        !is String -> print("is not String")
        else -> print("unknown")
    }
}


