/**
 * @author: Ivan Vigoss
 * Date: 16/4/24
 * Time: 22:04
 */
class Person constructor(var name: String) {
    val upperName = name.toUpperCase()

    init {
        println("Person name is $name")
    }

    //secondary constructor
    //
    constructor(name: String, address: String) : this(name) {

    }

    //custom getter
    val isMe: Boolean?
        get() = name.equals("me")

    //backing fields
    var counter = 0
        set(value) {
            if(value >=0)
                field = value
        }
}