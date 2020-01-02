package factory.abstract.pizza

import factory.abstract.ingredient.Cheese
import factory.abstract.ingredient.Dough
import factory.abstract.ingredient.Sauce

abstract class Pizza {
    lateinit var name: String
    lateinit var dough: Dough
    lateinit var sauce: Sauce
    lateinit var cheese: Cheese

    abstract fun prepare()

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
