package decorator.decorators

import decorator.Beverage

class Mocha(private val beverage: Beverage) : CondimentDecorator() {
    private val price = 500

    init {
        description = beverage.description + ", 모카"
    }

    override fun cost() = beverage.cost() + price
}