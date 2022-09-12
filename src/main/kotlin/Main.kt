import java.util.Scanner

class Main {
    fun main() {

        val reader = Scanner(System.`in`)

        val mySquare : Shape = Square("mySquare")
        val myCircle : Shape = Circle("myCircle")
        val myTriangle : Shape = Triangle("myTriangle")
        val myEquilateralTriangle : Shape = EquilateralTriangle("myEquilateralTriangle")

        println("Enter square height: ")
        val height: Int = reader.nextInt()
        println("Enter square length: ")
        val length: Int = reader.nextInt()

        println("Enter circle radius: ")
        val radius: Int = reader.nextInt()

        println("Enter triangle side 1: ")
        val side1: Int = reader.nextInt()
        println("Enter triangle side 2: ")
        val side2: Int = reader.nextInt()
        println("Enter triangle side 3: ")
        val side3: Int = reader.nextInt()

        println("Enter equilateral triangle side: ")
        val side: Int = reader.nextInt()

        println("SQUARE")
        mySquare.printDimensions()
        mySquare.getArea()

        println("CIRCLE")
        myCircle.printDimensions()
        myCircle.getArea()

        println("TRIANGLE")
        myTriangle.printDimensions()
        myTriangle.getArea()

        println("EQUILATERAL TRIANGLE")
        myEquilateralTriangle.printDimensions()
        myEquilateralTriangle.getArea()



    }
}