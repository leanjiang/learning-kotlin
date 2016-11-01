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

    }
}

//using string templates
fun main(args: Array<String>) {
    if (args.size == 0) return
    println("First argument: ${args[0]}")
}

//Using condition expressions
fun max(x: Int, y: Int): Int {
    if (x > y)
        return x
    else
        return y
}

//inline version
fun max1(x: Int, y: Int) = if (x > y) x else y

fun forLoop(args: Array<String>) {
    for (arg in args)
        print(arg)
    //indices means arrays index.
    for (i in args.indices)
        print(args[i])
}

fun whileLoop(args: Array<String>) {
    var i = 0
    while (i < args.size)
        print(args[i++])
}

fun whenExp(obj: Any) {
    when (obj) {
        1 -> print("one")
        "Hello" -> print("Greeting")
        is Long -> print("Long")
        !is String -> print("Not a string")
        else -> print("unknown")
    }
}
