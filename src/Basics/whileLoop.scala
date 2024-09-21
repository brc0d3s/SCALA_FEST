package Basics

object whileLoop {
  def main(args:Array[String]): Unit = {

    var num = 10

    while (num <= 30){
      println(num)
      num += 1
    }
  }
}
