package Basics

object forLoop {
  def main(args:Array[String]): Unit = {
    var sum = 0

    for(i <- 1 to 10){
      println(i)
      sum += i
    }
    println(s"Summation is : ${sum}")
  }
}
