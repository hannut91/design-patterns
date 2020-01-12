package composite.menu_components

class MenuItem(
    override var name: String,
    override var description: String,
    override var isVegetarian: Boolean,
    override var price: Int
) : MenuComponent() {
    override fun print() {
        println(
            "$name ${if (isVegetarian) "(채식) " else ""} $price $description"
        )
    }
}
