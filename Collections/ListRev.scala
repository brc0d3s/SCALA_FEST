object ListRev {
    def main(args: Array[String]): Unit = {
        def printDetails(mk: Array[Array[Int]]): Unit = {
            var sum = 0

            for (i <- 0 to 1) { // Iterate through rows
                for (j <- 0 to 4) { // Iterate through columns
                    print(" " + mk(i)(j))
                    sum += mk(i)(j) // Update the sum
                }
                println() // Newline after each row
            }
            println("The sum of all marks is \t" + sum)
        }

        // Example 2D array to test the function
        val marks = Array(
            Array(10, 20, 30, 40, 50),
            Array(15, 25, 35, 45, 55)
        )

        printDetails(marks) // Call the function with the sample array
    }
}
