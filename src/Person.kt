/**
 * Created by lean on 16/5/13.
 */
class Person(var firstName: String) {
    //read-only property
    val firstNameUppercase = firstName.toUpperCase()

    var firstNameLowercase = firstName.toLowerCase()

    init{
        print("Person initialed with firstName $firstName")
    }

    //secondary constructor.
    constructor(firstName: String, lastName: String) : this(firstName){

    }

}