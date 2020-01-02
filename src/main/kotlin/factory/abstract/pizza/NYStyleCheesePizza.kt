package factory.abstract.pizza

import factory.abstract.ingredient_factory.PizzaIngredientFactory

class NYStyleCheesePizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    init {
        name = "뉴욕스타일 치즈 피자"
    }

    override fun prepare() {
        println("$name 준비중")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}
