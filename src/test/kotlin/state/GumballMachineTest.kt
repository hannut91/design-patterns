package state

import org.junit.Test
import state.without_state.GumballMachine

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
