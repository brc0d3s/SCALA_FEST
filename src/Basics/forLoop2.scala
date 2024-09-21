package Basics

object forLoop2 {
  def main(args:Array[String]): Unit = {
    var sum = 0

    for(i <- 10 to 20 if i % 2 == 0){
      println(i)
      sum += i
    }
    println(s"Sum is : ${sum}")
  }
}
