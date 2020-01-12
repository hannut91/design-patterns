package composite.menu_components

class Menu(
    override var name: String,
    override var description: String
) : MenuComponent() {
    val menuComponents = arrayListOf<MenuComponent>()

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int) = menuComponents[i]

    override fun print() {
        println("$name $description")
        println("------------------")

        val iterator = menuComponents.iterator()
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }
}
