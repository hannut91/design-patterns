package singleton

object ChocolateBoiler {
    private var empty = true
    private var boiled = false

    fun fill() {
        if (empty) {
            empty = false
            boiled = false
            println("보일러에 우유/초콜릿을 혼합한 재료를 집어넣음")
        }
    }

    fun boil() {
        if (!empty && !boiled) {
            boiled = true
            println("재료를 끓임")
        }
    }

    fun drain() {
        if (!empty && boiled) {
            empty = true
            println("끓인 재료를 다음 단계로 넘김")
        }
    }
}
