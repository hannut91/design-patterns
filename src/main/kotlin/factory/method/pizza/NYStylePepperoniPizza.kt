package factory.method.pizza

class NYStylePepperoniPizza : Pizza() {
    init {
        name = "뉴욕스타일 페퍼로니 피자"
        dough = "얇은 도우"
        sauce = "토마토 소스"
        toppings.add("아메리카 치즈")
    }
}
