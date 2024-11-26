import scala.io.StdIn.readInt

object Age {
    def main(args: Array[String]) = {
        print("Enter your age: ")
        var age: Int = readInt()

        if (age >= 18) {
           println("Adult")
        } else {
           println("Underage") 
        }
    }
}
