package state.without_state

import org.junit.Test

internal class GumballMachineTest {
    @Test
    fun `Gumball machine test`() {
        val gumballMachine = GumballMachine(2)

        gumballMachine.insertCoin()
        gumballMachine.turnCrank()

        println("------------")

        gumballMachine.insertCoin()
        gumballMachine.ejectCoin()
        gumballMachine.turnCrank()

        println("------------")

        gumballMachine.insertCoin()
        gumballMachine.turnCrank()

        println("------------")

        gumballMachine.insertCoin()
        gumballMachine.ejectCoin()
        gumballMachine.turnCrank()
    }
}
