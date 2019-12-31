package decorator

abstract class Beverage {
    var description = "제목 없음"

    abstract fun cost(): Int
}