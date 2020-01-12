package state.states

interface State {
    fun insertCoin()
    fun ejectCoin()
    fun turnCrank()
    fun dispense()
    // TODO: refill을 추가해주세요.
}
