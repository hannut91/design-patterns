package adapter.adapters

import adapter.ducks.Duck
import adapter.turkeys.Turkey

class TurkeyAdapter(private val turkey: Turkey) : Duck {
    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        turkey.fly()
    }
}
