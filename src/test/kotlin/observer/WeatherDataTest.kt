package observer

import org.assertj.core.api.Assertions
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class WeatherDataTest {
    lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUp() {
        outContent = ByteArrayOutputStream()
        System.setOut(PrintStream(outContent))
    }

    @Test
    fun `Display test`() {
        val weatherData = WeatherData()
        val currentConditionDisplay = CurrentConditionDisplay(weatherData)

        weatherData.registerObserver(currentConditionDisplay)

        weatherData.setMeasurements(80F, 65F, 30.4F)
        weatherData.setMeasurements(40F, 35F, 30.4F)

        weatherData.removeObserver(currentConditionDisplay)

        weatherData.setMeasurements(20F, 10F, 30.4F)

        Assertions.assertThat(outContent.toString())
            .isEqualTo(
                "현재 상태 temperature: 80.0, humidity: 65.0\n" +
                        "현재 상태 temperature: 40.0, humidity: 35.0\n"
            )
    }
}