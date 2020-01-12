package composite.waitors

import composite.menu_components.MenuComponent

class Waiter(private val allMenus: MenuComponent) {
    fun printMenu() {
        allMenus.print()
    }
}
