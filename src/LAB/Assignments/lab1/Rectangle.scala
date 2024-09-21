package LAB.Assignments.lab1

import scala.io.StdIn.readDouble

object Rectangle{
   def main(args: Array[String]): Unit = {
     print("Enter Length : ")
     val length = readDouble()
     print("Enter Width : ")
     val width = readDouble()

     println(s"The ares is : ${getArea(length,width)}")
     println(s"The Perimeter is : ${getPerimeter(length,width)}")

   }

  def getArea(a:Double,b:Double): Double = {
    a * b
  }

  def getPerimeter(b:Double,c:Double): Double = {
    (b+c) * 2
  }
 }
