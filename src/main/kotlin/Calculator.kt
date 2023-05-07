import kotlin.math.pow

val options = arrayOf("+", "-", "/", "*", "%")

class Calculator(vararg numbers: Double) {

    //constructor(action: String, vararg numbers: Double) : this(numbers = numbers)

    val array = numbers
    fun sum() {
        println(array.sum())
    }

    fun sub() {
        var result = array[0]
        for (i in 0..array.size - 1) {
            if (i + 1 >= array.size) {
                break
            } else result -= array[i + 1]
        }
        println(result)
    }

    fun div() {
        var result = array[0]
        for (i in 0..array.size - 1) {
            if (i + 1 >= array.size) {
                break
            } else result /= array[i + 1]
        }
        println(result)
    }
    fun mult() {
        var result = array[0]
        for (i in 0..array.size - 1) {
            if (i + 1 >= array.size) {
                break
            } else result *= array[i + 1]
        }
        println(result)
    }
    fun pow(value: Int) {
        for (i in array){
            println(i.pow(value))
        }
    }
    fun divWRemainder(value: Int) {
        for (i in array) {
            println(i % value)
        }
    }
}