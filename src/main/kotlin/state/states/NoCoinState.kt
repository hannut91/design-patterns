package state.states

import state.GumballMachine

class NoCoinState(private val machine: GumballMachine) : State {
    override fun insertCoin() {
        println("동전을 넣었습니다.")
        machine.state = machine.hasCoinState
    }

    override fun ejectCoin() {
        println("동전을 넣어주세요.")
    }

    override fun turnCrank() {
        println("동전을 넣어주세요.")
    }

    override fun dispense() {
        println("동전을 넣어주세요.")
    }
}
