package strategy.interfaces

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("조용...")
    }
}