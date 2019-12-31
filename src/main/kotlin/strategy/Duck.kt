package strategy

import strategy.interfaces.FlyBehavior
import strategy.interfaces.FlyWithWings
import strategy.interfaces.Quack
import strategy.interfaces.QuackBehavior

abstract class Duck {
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
        // TODO: 과제
        // 지금은 모든 오리가 헤엄을 칠 수 있지만 만약 무거운 철로 만든 오리는 물에 가라 앉습니다.
        // 이런 경우에도 전략 패턴을 이용해서 구현해보세요.
        println("헤엄을 칩니다.")
    }
}