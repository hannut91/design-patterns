package iterator.waiters

import iterator.iterators.Iterator
import iterator.menuitems.MenuItem
import iterator.menus.Menu

class Waiter(
    private val menus: ArrayList<Menu>
) {
    fun printMenu() {
        val menuIterator = menus.iterator()
        while (menuIterator.hasNext()) {
            val menu = menuIterator.next()
            printMenu(menu.createIterator())
        }
    }

    private fun printMenu(iterator: Iterator) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next() as MenuItem
            println("${menuItem.name} ${menuItem.description} ${menuItem.price}")
        }
    }
}
