package iterator.waiters

import iterator.menus.DinnerMenu
import iterator.menus.PancakeHouseMenu
import org.junit.Test

internal class WaiterTest {
    @Test
    fun `Prints all menuItems`() {
        val menus = arrayListOf(PancakeHouseMenu(), DinnerMenu())
        val waiter = Waiter(menus)

        waiter.printMenu()
    }

    @Test
    fun `Prints all menuItems with cafe menu`() {
        val menus = arrayListOf(
            PancakeHouseMenu(),
            DinnerMenu()
            // TODO CafeMenu()
        )
        val waiter = Waiter(menus)

        waiter.printMenu()
    }
}
