package Basics

object forLoopCollection {
  def main(args:Array[String]): Unit = {
    var list = List(70,45,65,76,12)

    for (i <- list){
      println(i)
    }
  }
}
