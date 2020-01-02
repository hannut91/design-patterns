package factory.abstract.ingredient_factory

import factory.abstract.ingredient.Cheese
import factory.abstract.ingredient.Dough
import factory.abstract.ingredient.Sauce

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
}
