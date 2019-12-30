package strategy

import strategy.interfaces.*

open abstract class Duck {
    var flyBehavior: FlyBehavior = FlyWithWings()
    var quackBehavior: QuackBehavior = Quack()
    var swimBehavior: SwimBehavior = Swim()

    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performSwim() {
        swimBehavior.swim()
    }
}