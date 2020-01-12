package state.without_state

class GumballMachine(var count: Int) {
    var state: State = State.SOLD

    init {
        if (this.count > 0) {
            state = State.NO_COIN
        }
    }

    fun insertCoin() {
        when (state) {
            State.HAS_COIN -> println("동전은 한 개만 넣어주세요.")
            State.NO_COIN -> {
                state = State.HAS_COIN
                println("동전이 삽입되었습니다.")
            }
            State.SOLD_OUT -> println("매진되엇습니다.")
            State.SOLD -> println("알맹이가 나가고 있습니다. 잠시 후에 다시 시도해주세요.")
        }
    }

    fun ejectCoin() {
        when (state) {
            State.HAS_COIN -> {
                println("동전이 반환됩니다.")
                state = State.NO_COIN
            }
            State.NO_COIN -> {
                println("동전을 넣어주세요.")
            }
            State.SOLD_OUT -> println("동전을 넣지 않았습니다.")
            State.SOLD -> println("이미 알맹이를 뽑았습니다.")
        }
    }

    fun turnCrank() {
        when (state) {
            State.HAS_COIN -> {
                println("손잡이를 돌렸습니다.")
                state = State.SOLD
                dispense()
            }
            State.NO_COIN -> {
                println("동전을 넣어주세요.")
            }
            State.SOLD_OUT -> println("매진되었습니다.")
            State.SOLD -> println("손잡이는 한 번만 돌려주세요.")
        }
    }

    fun dispense() {
        when (state) {
            State.HAS_COIN -> println("알맹이가 나갈 수 없습니다.")
            State.NO_COIN -> println("동전을 넣어주세요.")
            State.SOLD_OUT -> println("매진되었습니다.")
            State.SOLD -> {
                println("알맹이가 나가고 있습니다.")
                count -= 1
                if (count == 0) {
                    println("더 이상 알맹이가 없습니다.")
                    state = State.SOLD_OUT
                } else {
                    state = State.NO_COIN
                }
            }
        }
    }
}
