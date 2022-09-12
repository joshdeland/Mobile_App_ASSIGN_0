class Square(_name: String) : Shape(_name) {

    var height: Int = 0
    var length: Int = 0


    fun setDimensions(_length: Int, _height: Int) {
        length = _length
        height = _height
    }

    override fun printDimensions() {
        println("Length: $length")
        println("Height: $height")
    }

    override fun getArea() {
        print("Area: $length * $height")
    }
}