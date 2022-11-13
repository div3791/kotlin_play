fun main(args: Array<String>) {
val d = Demo()
    d.drag()
}

/*
Kotlin doenst allow multiple inheritance
we can achieve multiple inheritance feature
by using interface
 */

interface Draggable{
    fun drag()
    fun sa(){
        println("Hello")
    }
}

interface Clonable {
    fun clone()
}

abstract class Abstrct:Draggable,Clonable {

}

class Demo : Abstrct() {
    override fun drag() {
         sa()
    }

    override fun clone() {

    }

}