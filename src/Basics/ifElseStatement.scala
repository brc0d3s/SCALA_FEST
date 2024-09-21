package Basics

import scala.io.StdIn.readDouble

object ifElseStatement {
  def main(args:Array[String]): Unit = {
    print("Enter your marks: ")
    val marks: Double = readDouble()
    var grade:Char = 'U'

    if (marks >= 70){
      grade = 'A'
    } else if(marks >= 60){
      grade = 'B'
    } else if(marks >= 50){
      grade = 'C'
    } else if(marks >= 40){
      grade = 'D'
    } else {
      grade = 'F'
    }

    println(s"Your grade is : ${grade}")
  }
}
