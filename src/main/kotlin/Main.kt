fun main(args: Array<String>) {
    letScopeFunction()
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