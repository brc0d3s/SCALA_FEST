package Basics

import scala.io.StdIn.{readInt, readLine}

object IfStatement {
  def main(args:Array[String]){
    print("Enter your name: ")
    val name: String = readLine()

    print("Enter your age : ")
    val age: Int = readInt()

    if (age >= 18){
      println(s"${name} You are an Eligible voter")
    }
  }
}
