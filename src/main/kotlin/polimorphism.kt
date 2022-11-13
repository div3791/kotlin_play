import kotlin.math.roundToInt

/*
we can create reference of parent type and
call methods of child class. this is called
polymorphism
run time par decide thase ke kaya child ne refer kare 6e
ena according methods call thase
 */

fun main(args: Array<String>) {

    val circle:Shape = Circle(15.0)
    val square:Shape = Square(20.0)

    var arr = arrayOf(circle,square)

    displayArea(arr)
}

fun displayArea(arr:Array<Shape>){
    for(i in arr){
        /*
        ahiya kaya class ni area method call karvani
        e run time par decide thase
         */
        println(i.area())
    }
}

open class Shape {
    open fun area():Double {
        return 0.0
    }
}

private class Circle(private val radius: Double) : Shape(){

    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

private class Square(private val side:Double):Shape(){
    override fun area(): Double {
        return  side * side
    }
}