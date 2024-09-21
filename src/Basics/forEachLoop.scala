package Basics

object forEachLoop {
  def main(args:Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    list.foreach{element =>
      println(element)
    }
  }
}
