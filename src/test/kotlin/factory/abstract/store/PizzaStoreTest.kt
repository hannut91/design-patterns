package factory.abstract.store

import org.junit.Test

internal class PizzaStoreTest {
    @Test
    fun `피자 스토어 테스트`() {
        val nyStore = NYPizzaStore()

        nyStore.orderPizza("cheese")
    }
}
