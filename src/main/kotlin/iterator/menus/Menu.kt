package iterator.menus

import iterator.iterators.Iterator

interface Menu {
    fun createIterator(): Iterator
}
