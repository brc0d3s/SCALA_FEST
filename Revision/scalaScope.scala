object Scalascope{
    def main(args: Array[String]): Unit = {
        // Field: belongs to the object
        var fieldVar: String = "I am a field variable"

        def display(message: String): Unit = { // Method parameter: scoped to this method
        println(s"Method parameter: $message")
        }


        // Local variable: scoped to this block
        val localVar = "I am a local variable"
        println(s"Local variable: $localVar")

        // Accessing field
        println(s"Field value: $fieldVar")

    }
}