package observer.interfaces

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}