package strategy.interfaces

class Squack : QuackBehavior {
    override fun quack() {
        println("삑삑!")
    }
}