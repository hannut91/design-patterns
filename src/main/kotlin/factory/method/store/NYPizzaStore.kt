package factory.method.store

import factory.method.pizza.NYStyleCheesePizza
import factory.method.pizza.NYStylePepperoniPizza

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String) = when (type) {
        "cheese" -> NYStyleCheesePizza()
        "pepperoni" -> NYStylePepperoniPizza()
        else -> NYStyleCheesePizza()
    }
}
