package factory.method.pizza

abstract class Pizza {
    lateinit var name: String
    lateinit var dough: String
    lateinit var sauce: String
    val toppings = arrayListOf<String>()

    open fun prepare() {
        println("${name} 준비중")
        println("${dough}반죽을 준비중")
        println("${sauce} 준비중")
        toppings.forEach { println("${it}토핑을 넣는중") }
    }

    open fun bake() {
        println("피자를 굽는중")
    }

    open fun cut() {
        println("피자를 자르는중")
    }

    open fun box() {
        println("피자를 포장하는")
    }
}
