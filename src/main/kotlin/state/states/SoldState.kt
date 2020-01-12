package state.states

import state.GumballMachine

class SoldState(private val machine: GumballMachine) : State {
    override fun insertCoin() {
        println("잠깐만 기다려주세요. 알맹이가 나가고 있습니다.")
    }

    override fun ejectCoin() {
        println("이미 알맹이를 뽑았습니다.")
    }

    override fun turnCrank() {
        println("손잡이는 한 번만 돌려주세요")
    }

    override fun dispense() {
        machine.releaseBall()
        if (machine.count > 0) {
            machine.state = machine.noCoinState
        } else {
            println("알맹이가 없습니다.")
            machine.state = machine.soldoutState
        }
    }
}
