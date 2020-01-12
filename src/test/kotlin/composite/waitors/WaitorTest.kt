package composite.waitors

import composite.menu_components.Menu
import composite.menu_components.MenuItem
import org.junit.Test

internal class WaitorTest {
    @Test
    fun `Waitor print test`() {
        val pancakeHouseMenu = Menu("펜케이크 하우", "아침 메뉴")
        val restaurantMenu = Menu("레스토랑", "점심 메뉴")
        val dessertMenu = Menu("디저트 메뉴", "디저트")

        val allMenus = Menu("전체메뉴", "전체메뉴")

        allMenus.add(pancakeHouseMenu)
        allMenus.add(restaurantMenu)

        pancakeHouseMenu.add(
            MenuItem("팬케이크", "스크램블드 에그와 토스트가 곁들여진 팬케이크", true, 3000)
        )
        pancakeHouseMenu.add(
            MenuItem(
                "블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 펜케이크", true,
                3000
            )
        )
        pancakeHouseMenu.add(
            MenuItem("와플", "취향에 따라 블루베리나 딸기를 얹을 수 있습니다.", true, 3000)
        )

        restaurantMenu.add(
            MenuItem(
                "채식주의자용 BLT", "통밀 위에 (식물성) 베이컨, 상추, 토마토를 얹은 메뉴", true,
                3000
            )
        )
        restaurantMenu.add(
            MenuItem(
                "BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴",
                false, 3000
            )
        )
        restaurantMenu.add(
            MenuItem(
                "오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false,
                2500
            )
        )
        restaurantMenu.add(dessertMenu)

        dessertMenu.add(MenuItem("브라우니", "초코 브라우니", true, 1500))
        dessertMenu.add(MenuItem("아이스크림", "바닐라 아이스크림", true, 1500))
        dessertMenu.add(MenuItem("과일", "새콜달콤 파인애플", true, 1500))

        val waiter = Waiter(allMenus)

        waiter.printMenu()
    }
}
