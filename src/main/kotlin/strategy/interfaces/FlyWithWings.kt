package strategy.interfaces

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("I'm flying!")
    }
}