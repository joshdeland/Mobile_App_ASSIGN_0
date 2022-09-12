import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Shape(_name) {

    var side: Int = 0


    fun setDimensions(_length: Int, _height: Int) {

        side = _height
    }

    override fun printDimensions() {

        println("Height: $side")
    }

    override fun getArea() {
        val perim = side * 3
        val areaVal = perim - side
        val area = sqrt((perim * areaVal * areaVal * areaVal).toDouble())
        print("Area: %.2f".format(area))
    }
}
