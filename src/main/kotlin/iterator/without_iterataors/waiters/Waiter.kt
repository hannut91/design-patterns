package iterator.without_iterataors.waiters

import iterator.without_iterataors.menus.DinnerMenu
import iterator.without_iterataors.menus.PancakeHouseMenu

class Waiter(
    val pancakeHouseMenu: PancakeHouseMenu,
    val dinnerMenu: DinnerMenu
) {
    fun printMenu() {
        pancakeHouseMenu.menuItems
            .forEach {
                println("${it.name} ${it.description} ${it.price}")
            }

        dinnerMenu.menuItems.forEach {
            if (it != null) {
                println("${it.name} ${it.description} ${it.price}")
            }
        }
    }
}
