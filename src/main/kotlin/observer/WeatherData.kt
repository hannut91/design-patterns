package observer

import observer.interfaces.Observer
import observer.interfaces.Subject

class WeatherData : Subject {
    val observers = arrayListOf<Observer>()
    var temperature = 0F
    var humidity = 0F
    var pressure = 0F

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val index = observers.indexOf(o)
        if (index >= 0) {
            observers.removeAt(index)
        }
    }

    override fun notifyObservers() {
        observers.forEach { it.update(temperature, humidity, pressure) }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}