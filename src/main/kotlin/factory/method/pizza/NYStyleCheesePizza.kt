package factory.method.pizza

class NYStyleCheesePizza : Pizza() {
    init {
        name = "뉴욕스타일 치즈 피자"
        dough = "얇은 도우"
        sauce = "토마토 소스"
        toppings.add("아메리카 치즈")
    }
}
