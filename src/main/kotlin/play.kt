fun main(args: Array<String>) {


    findNonRepetitiveItem(arrayOf(1, 3, 2, 8, 1, 8))
}

fun swapNumbers(x: Int, y: Int) {
    var a = x;
    var b = y;

    a = a xor b;
    b = a xor b;
    a = a xor b;

    println("Swapped res: a=$a b=$b")
}

fun swapItemsInArray(arr: Array<Int>, start: Int, end: Int): Array<Int> {


    val temp: Int = arr[start]
    arr[start] = arr[end]
    arr[end] = temp

    return arr
}

fun findNonRepetitiveItem(arr: Array<Int>) {

    var oneArr = mutableListOf<Int>();
    var twoArr = mutableListOf<Int>();
    var res = 0;
    for (i: Int in arr) {
        res = res xor i
    }
    var one = 0
    var two = 0
    for (i: Int in arr) {
        if (i and 1 == 0) {
            oneArr.add(i)
        } else {
            twoArr.add(i)
        }
    }

      for(i:Int in oneArr){
         one = res xor i
      }


    for(i:Int in twoArr){
        two = res xor i
    }

    println(" $one $two")



}