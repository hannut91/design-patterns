package factory.abstract.store

import factory.abstract.ingredient_factory.NYPizzaIngredientFactory
import factory.abstract.pizza.NYStyleCheesePizza
import factory.abstract.pizza.Pizza

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        val ingredientFactory = NYPizzaIngredientFactory()

        return when (type) {
            "cheese" -> NYStyleCheesePizza(ingredientFactory)
            else -> NYStyleCheesePizza(ingredientFactory)
        }
    }
}
