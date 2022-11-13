fun main(args: Array<String>) {

    var a = Divyesh()
    a.area()
}

abstract class Human(var personName:String) {

    abstract fun area():Double

    fun display(){
        println(personName)
    }
}

class Divyesh:Human("Divyesh"){

    override fun area(): Double {
        super.display()
         return 1.2
    }

}