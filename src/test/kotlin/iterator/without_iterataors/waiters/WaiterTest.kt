package iterator.without_iterataors.waiters

import iterator.without_iterataors.menus.DinnerMenu
import iterator.without_iterataors.menus.PancakeHouseMenu
import org.junit.Test

internal class WaiterTest {
    @Test
    fun `Prints all menuItems`() {
        val pancakeHouseMenu = PancakeHouseMenu()
        val dinnerMenu = DinnerMenu()
        val waiter = Waiter(pancakeHouseMenu, dinnerMenu)

        waiter.printMenu()
    }
}
