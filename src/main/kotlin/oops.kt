fun main(args: Array<String>) {

    val p1 = Person("Divyesh",10)

    p1.age = 18
}

//primary constructor
class Car(val name:String = "Divyesh", val kmRun:Int? = 60, isthis:Boolean){

    //executed first at the time of object creation.
    init {
        println("initializer bloc")
    }

    // secondary constructor
    constructor(name: String,speed:Int):this(name,speed,true){
        println("secondary constructor")
    }

    fun driveCar(){
        println("Driving $name")
    }

    fun applyBreak(){
        println("Breaking $name at ${kmRun?.dec()?:20}")
    }
}

class Person(name: String, age:Int){
    var name:String = name
    var age:Int = age
        set(value) {
            if(value>18){
                field = value
            }else {
                println("age is lower")
            }
        }
}
