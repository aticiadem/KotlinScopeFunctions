fun main(args: Array<String>) {
    //letScopeFunction()
    withScopeFunction()
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