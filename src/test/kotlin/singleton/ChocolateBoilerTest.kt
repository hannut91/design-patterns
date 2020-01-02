package singleton

import org.junit.Test

internal class ChocolateBoilerTest {
    @Test
    fun `초콜렛 끓이기 테스트`() {
        ChocolateBoiler.fill()
        ChocolateBoiler.boil()
        ChocolateBoiler.drain()
    }
}
