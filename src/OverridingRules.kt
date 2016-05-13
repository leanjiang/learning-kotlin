/**
 * Created by lean on 16/5/13.
 */
class OverridingRules {
}

open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

//interface 为什么可以直接定义方法实现?
interface B {
    fun f() {
        print("B")
    }

    fun b() {
        print("b")
    }
}

//当C的父类都有同样的方法时,必须重写这个相同的方法
//调用super时可以在<>内指定是哪个super
class C : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}