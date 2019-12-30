package strategy

import strategy.interfaces.FlyBehavior
import strategy.interfaces.FlyWithWings
import strategy.interfaces.Quack
import strategy.interfaces.QuackBehavior

open abstract class Duck {
    var flyBehavior: FlyBehavior = FlyWithWings()
    var quackBehavior: QuackBehavior = Quack()

    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        println("모든 오리는 헤엄을 칠 수 있습니다. 모든 오리는 물에 뜹니다.")
    }
}