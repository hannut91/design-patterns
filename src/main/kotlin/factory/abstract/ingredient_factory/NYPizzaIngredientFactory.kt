package factory.abstract.ingredient_factory

import factory.abstract.ingredient.MarinaraSauce
import factory.abstract.ingredient.ReggianoCheese
import factory.abstract.ingredient.ThinCrustDough

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough() = ThinCrustDough()
    override fun createSauce() = MarinaraSauce()
    override fun createCheese() = ReggianoCheese()
}
