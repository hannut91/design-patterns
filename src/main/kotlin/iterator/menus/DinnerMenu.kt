package iterator.menus

import iterator.iterators.DinnerMenuIterator
import iterator.iterators.Iterator
import iterator.menuitems.MenuItem

class DinnerMenu : Menu {
    val MAX_ITEMS = 6
    val menuItems: Array<MenuItem?> = Array(MAX_ITEMS) { null }
    var menuItemsCount = 0

    init {
        addMenuItem(
            "채식주의자용 BLT", "통밀 위에 (식물성) 베이컨, 상추, 토마토를 얹은 메뉴", true,
            3000
        )
        addMenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 3000)
        addMenuItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 2500)
        addMenuItem(
            "핫도그", "샤워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3000
        )
    }

    fun addMenuItem(
        name: String,
        description: String,
        vegetarian: Boolean,
        price: Int
    ) {
        if (menuItemsCount >= MAX_ITEMS) {
            println("메뉴가 꽉찼습니다.")
            return
        }

        menuItems[menuItemsCount] =
            MenuItem(name, description, vegetarian, price)
        menuItemsCount += 1
    }

    override fun createIterator(): Iterator = DinnerMenuIterator(menuItems)
}
