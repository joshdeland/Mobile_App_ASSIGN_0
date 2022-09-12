class Circle(_name: String) : Shape(_name) {

    var radius: Int = 0


    fun setDimensions(_radius: Int) {
        radius = _radius
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea() {
        val area: Double = Math.PI * (radius * radius)
        print("Area: %.2f".format(area))
    }
}