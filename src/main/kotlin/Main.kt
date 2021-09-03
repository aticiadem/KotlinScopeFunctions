fun main(args: Array<String>) {
    //letScopeFunction()
    //withScopeFunction()
    runScopeFunction()
}

private fun letScopeFunction() {
    var str: String? = null
    str?.let {
        println("Hello")
    }
    str = "Adem"
    str?.let {
        println("Hello $it")
    }
}

private fun withScopeFunction() {
    val numbers = arrayListOf<Int>(1, 2, 3)
    with(numbers) {
        println("We have $size numbers")
        println("Last number is ${last()}")
    }
}

private fun runScopeFunction(){
    // compute result as block result
    val result = run {
        val x = 10
        val y = x + 3
        y - 10
    }
    println("Result: $result")
    // compute result with receiver
    val result2 = "text".run {
        val tail = substring(1)
        tail.uppercase()
    }
    println("Result2: $result2")
}