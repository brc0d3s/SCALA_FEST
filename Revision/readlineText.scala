import scala.io.StdIn.readLine

object readlinetext{
  def main(args:Array[String]): Unit = {
    println("Enter Your name: ")
    val name = readLine()

    println("Enter your age: ")
    val age = readLine()

    println(s"$name $age")
  }
}