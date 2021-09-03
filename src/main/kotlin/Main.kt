fun main(args: Array<String>) {
    //letScopeFunction()
    //withScopeFunction()
    //runScopeFunction()
    //applyScopeFunction()
    alsoScopeFunction()
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

private fun runScopeFunction() {
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

data class Person(var name: String, var age: Int = 0, var city: String = "")

private fun applyScopeFunction() {
    val adem = Person("Adem").apply {
        age = 21
        city = "Kocaeli"
    }
    println(adem)
}

private fun alsoScopeFunction() {
    val strList = arrayListOf<Int>(1,2,3,4,5)
    strList.also {
        it.add(6)
        it.add(0,10)
        println("str length is ${it.size}")
    }
    println(strList)
}