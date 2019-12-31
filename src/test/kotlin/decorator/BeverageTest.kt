package decorator

import decorator.decorators.Mocha
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

internal class BeverageTest {
    @Test
    fun `Normal coffee cost test`() {
        val coffee = Coffee()

        assertThat(coffee.description).isEqualTo("일반 커피")
        assertThat(coffee.cost()).isEqualTo(2500)
    }

    @Test
    fun `Add Mocha to coffee`() {
        val coffeeWithMocha = Mocha(Coffee())

        assertThat(coffeeWithMocha.description).isEqualTo("일반 커피, 모카")
        assertThat(coffeeWithMocha.cost()).isEqualTo(3000)
    }
}