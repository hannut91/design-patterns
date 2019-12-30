package observer

import observer.interfaces.DisplayElement
import observer.interfaces.Observer
import observer.interfaces.Subject

class CurrentConditionDisplay(val weatherData: Subject) : Observer, DisplayElement {
    var temperature = 0F
    var humidity = 0F

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("현재 상태 temperature: $temperature, humidity: $humidity")
    }
}