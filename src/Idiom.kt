/**
 * Created by lean on 16/4/20.
 */

//read-only list
val list = listOf("a", "b", "c")

//read-only map
val map = mapOf("a" to 1, "b" to 2, "c" to 3)

fun main(args: Array<String>) {
    for((k,v) in map)
        println("$k -> $v")


}