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
fun printSum1(a: Int,b: Int){
    print(a+b)
}