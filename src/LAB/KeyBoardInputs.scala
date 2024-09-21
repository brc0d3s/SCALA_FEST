package LAB

import scala.io.StdIn.readInt

object KeyBoardInputs {
  def main(args: Array[String]){
    println("Hello World")
    // The function is called without specifying the arguments
    println("Return value from keyboard inputs: " + totalMarks1())
    println("Return value from random marks: " + totalMarks())
  }

  // A function to read from keyboard
  def totalMarks1(a: Double = readInt(), b: Double = readInt(), c: Double = readInt()): Double = {
    println("Enter three marks:")
    a + b + c
  }

  // A function to generate the marks randomly
  def totalMarks(a: Double = Math.ceil(Math.random() * 10), b: Double = Math.ceil(Math.random() * 20), c: Double = Math.ceil(Math.random() * 70)): Double = {
    a + b + c
  }
}
