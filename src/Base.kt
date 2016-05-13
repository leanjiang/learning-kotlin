/**
 * Created by lean on 16/5/13.
 */
open class Base {
    open fun v() {
    }

    fun nv() {
    }
}

class Derived : Base {

    constructor() : super(){

    }

    override fun v() {
        super.v()
    }
}