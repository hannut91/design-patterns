package strategy.interfaces

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("Can't fly!")
    }
}