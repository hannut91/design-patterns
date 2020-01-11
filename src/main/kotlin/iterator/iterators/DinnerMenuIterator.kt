package iterator.iterators

import iterator.menuitems.MenuItem

class DinnerMenuIterator(
    val items: Array<MenuItem?>
) : Iterator {
    var position = 0

    override fun next(): Any {
        val menuItem = items[position]
        position += 1
        return menuItem!!
    }

    override fun hasNext() = items[position] != null
}
