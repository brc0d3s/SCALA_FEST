object CallByNameExample {

    def main(args: Array[String]): Unit = {
        println("Program started...")
        delayed(System.nanoTime()) // Passing an expression (System.nanoTime())
        println("Program ended...")
    }
    
    // Call-by-name parameter
    def delayed(t: => Long): Unit = {
        println("Entering the function...")
        println("Value of t: " + t)  // The parameter t is evaluated here
        println("Value of t again: " + t)  // Evaluated again here
        println("Exiting the function...")
    }

}
