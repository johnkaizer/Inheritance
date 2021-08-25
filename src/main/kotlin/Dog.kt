class Dog(private val eat: String, private val move: String, private val legs: Int):Animals(eat, move, legs) {
    fun woof(){
        println("I woof")
    }
}