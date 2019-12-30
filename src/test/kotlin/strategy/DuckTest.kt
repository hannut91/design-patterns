package strategy

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import strategy.interfaces.FlyNoWay
import strategy.interfaces.Squack
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class DuckTest {
    lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUp() {
        outContent = ByteArrayOutputStream()
        System.setOut(PrintStream(outContent))
    }

    @Test
    fun `Mini Duck simulator`() {
        class MallardDuck : Duck() {
            override fun display() {
                // TODO
            }
        }

        val duck = MallardDuck()

        duck.performFly()
        duck.performQuack()

        assertThat(outContent.toString()).isEqualTo("I'm flying!\n꽥꽥!\n")
    }

    @Test
    fun `RubberDuck`() {
        class RubberDuck : Duck() {
            override fun display() {
                // TODO
            }
        }

        val duck = RubberDuck()
        duck.flyBehavior = FlyNoWay()
        duck.quackBehavior = Squack()
        duck.performFly()
        duck.performQuack()

        assertThat(outContent.toString()).isEqualTo("Can't fly!\n삑삑!\n")
    }
}