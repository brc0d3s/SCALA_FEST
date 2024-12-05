import scala.io.StdIn.readLine

object Reader {
    def main(args: Array[String]): Unit = {
        println("Enter your Name: ")
        val name = readLine()  // Correct method for reading input
        println(s"Hello, $name!")  // Improved to greet the user
    }   
}
