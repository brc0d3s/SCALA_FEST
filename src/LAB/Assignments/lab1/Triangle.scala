package LAB.Assignments.lab1

import scala.io.StdIn.readDouble

object Triangle {
  def main(args: Array[String]): Unit = {
    print("Enter side : ")
    val side = readDouble()
    print("Enter height : ")
    val height = readDouble()

    println(s"The area is : ${getArea(side,height)}")
    println(s"The Perimeter is : ${getPerimeter(side)}")

  }

  def getArea(a:Double,b:Double): Double = {
    (0.5 * a) * b
  }

  def getPerimeter(c:Double): Double = {
    c * 3
  }
}
