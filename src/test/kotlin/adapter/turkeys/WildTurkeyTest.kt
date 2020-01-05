package adapter.turkeys

import adapter.adapters.TurkeyAdapter
import adapter.ducks.Duck
import org.junit.Test

internal class WildTurkeyTest {
    @Test
    fun `Turky test`() {
        val turkey = WildTurkey()
        val turkeyAdapter: Duck = TurkeyAdapter(turkey)

        turkeyAdapter.quack()
        turkeyAdapter.fly()
    }

    // TODO 과제: 닭을 오리 인터페이스에 맞춰서 쓸 수 있도록 닭 어댑터를 만드세요.
}
