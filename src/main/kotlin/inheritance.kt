fun main(args: Array<String>) {

    var b = BasicPhone("Android","Smart")
    b.makeCall()
    println(b.toString())
}

/*
Every kotlin class has Any as a superclass

Kotlin provides single inheritance only
we can not inherit multiple classes in single child
ek child no ek j parent hoy sake
*/
open class Phone( var name:String,type:String, volume:Int) {

      var type: String
      var volume:Int = 10

    init {
        this.type = type
        this.volume = volume
        println("parent class initializer")
    }

    // to let child class override, function must be open
    open fun makeCall(){
        println("parent call")
    }
    fun display(){}
    fun powerOff(){}
}

class BasicPhone(name:String, type: String) : Phone(name,type,0) {

    override fun makeCall(){
        super.makeCall()
        println("child call")
    }

    init {
        println("child class initializer")
    }

    override fun toString(): String {
        return "Name: $name"

    }
}