package composite.menu_components

abstract class MenuComponent {
    open var name: String = ""
    open var description: String = ""
    open var isVegetarian: Boolean = false
    open var price: Int = 0

    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open fun print() {
        throw UnsupportedOperationException()
    }
}
