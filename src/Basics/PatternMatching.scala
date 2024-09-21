package Basics

object PatternMatching {
  def main(args:Array[String]): Unit = {
    val a = 2

    a match {
      case 1 => print("One")
      case 2 => print("Two")
      case _ => print("Non")
    }
  }
}
