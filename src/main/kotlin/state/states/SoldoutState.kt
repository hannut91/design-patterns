package state.states

import state.GumballMachine

class SoldoutState(private val machine: GumballMachine) : State {
    override fun insertCoin() {
        println("매진되엇습니다.")
    }

    override fun ejectCoin() {
        println("동전을 넣지 않았습니다.")
    }

    override fun turnCrank() {
        println("매진되었습니다")
    }

    override fun dispense() {
        println("매진되엇습니다.")
    }
}
