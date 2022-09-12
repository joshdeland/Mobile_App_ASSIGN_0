import kotlin.math.sqrt

class Triangle(_name: String) : Shape(_name) {

    var sideA: Int = 0
    var sideB: Int = 0
    var sideC: Int = 0



    fun setDimensions(a: Int, b: Int, c: Int) {
        sideA = a
        sideB = b
        sideC = c
    }

    override fun printDimensions() {
        println("Side A: $sideA")
        println("Side B: $sideB")
        println("Side C: $sideC")

    }

    override fun getArea() {
        val perim: Int = sideA + sideB + sideC
        val area: Double = sqrt((perim * (perim - sideA) * (perim - sideB)* (perim - sideC)).toDouble())
        println("Area: %.2f".format(area))
    }
}