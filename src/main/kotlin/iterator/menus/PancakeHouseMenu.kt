package iterator.menus

import iterator.iterators.Iterator
import iterator.iterators.PancakeMenuIterator
import iterator.menuitems.MenuItem

class PancakeHouseMenu : Menu {
    val menuItems = ArrayList<MenuItem>()

    init {
        addMenuItem("팬케이크", "스크램블드 에그와 토스트가 곁들여진 팬케이크", true, 3000)

        addMenuItem(
            "블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 펜케이크", true,
            3000
        )
        addMenuItem("와플", "취향에 따라 블루베리나 딸기를 얹을 수 있습니다.", true, 3000)
    }

    fun addMenuItem(
        name: String,
        description: String,
        vegetarian: Boolean,
        price: Int
    ) {
        menuItems.add(MenuItem(name, description, vegetarian, price))
    }

    override fun createIterator(): Iterator = PancakeMenuIterator(menuItems)
}
