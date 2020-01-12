package state

import state.states.*

class GumballMachine(var count: Int) {
    val soldoutState: State = SoldoutState(this)
    val noCoinState: State = NoCoinState(this)
    val hasCoinState: State = HasCoinState(this)
    val soldState: State = SoldState(this)

    var state: State = soldoutState

    init {
        if (count > 0) {
            state = noCoinState
        }
    }

    fun insertCoin() {
        state.insertCoin()
    }

    fun ejectCoin() {
        state.ejectCoin()
    }

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun releaseBall() {
        println("알맹이가 나가고 있습니다.")
        count -= 1
    }
}
