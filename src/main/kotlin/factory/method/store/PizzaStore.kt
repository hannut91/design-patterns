package factory.method.store

import factory.method.pizza.Pizza

abstract class PizzaStore {
    fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    abstract fun createPizza(type: String): Pizza
}
