fun main(args: Array<String>) {

    var a = object :X(){}

    a.displayData()
    a.name = "Shani"

    var b = a
    b.displayData()
}

/*
This is used for singleton pattern
we can not create multiple instances
of this type of objects
 */
object A : Sample {
      var name:String = "Divyesh"
    fun displayData(){
        println(name)
    }

    init {
        println("Initializer")
    }

    override fun clone() {
        TODO("Not yet implemented")
    }


}

interface Sample {
    fun clone()
}

open class X {
    var name = "Divyesh"
    fun displayData(){
        println(name)
    }
}