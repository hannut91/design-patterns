package decorator

class Coffee : Beverage {
    constructor() {
        description = "일반 커피"
    }

    override fun cost(): Int {
        return 2500
    }
}