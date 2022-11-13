fun main(args: Array<String>) {

    var data:String? = null
    println(data?.uppercase())

}
/*
Everywhere
 */
var a = "Divyesh"

/*
within same module
 */
internal val b = "Divyesh"

/*
within same file if it not inside the class
if private data is inside the class, then
it can be accessed within class only
 */
private fun c() = print("Hello")

/*
protected data can be accessed limited
to sub classes only
 */