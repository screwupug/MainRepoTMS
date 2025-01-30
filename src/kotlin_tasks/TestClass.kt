package kotlin_tasks

class TestClass(
    private val name: String
) {



    companion object {
        fun test() {
            println("Test")
        }

        fun getInstance(name: String): TestClass {
            return TestClass(name)
        }
    }
}