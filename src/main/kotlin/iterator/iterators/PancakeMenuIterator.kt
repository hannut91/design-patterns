package iterator.iterators

import iterator.menuitems.MenuItem

class PancakeMenuIterator(
    val items: ArrayList<MenuItem>
) : Iterator {
    var position = 0

    override fun next(): Any {
        val menuItem = items[position]
        position += 1
        return menuItem
    }

    override fun hasNext() = position < items.size
}
