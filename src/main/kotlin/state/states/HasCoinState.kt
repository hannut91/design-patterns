package state.states

import state.GumballMachine

class HasCoinState(private val machine: GumballMachine) : State {
    override fun insertCoin() {
        println("동전은 한 개만 넣어주세요.")
    }

    override fun ejectCoin() {
        println("동전이 반환됩니다.")
        machine.state = machine.noCoinState
    }

    override fun turnCrank() {
        println("손잡이를 돌렸습니다.")
        machine.state = machine.soldState
    }

    override fun dispense() {
        println("알맹이가 나갈 수 없습니다.")
    }
}
