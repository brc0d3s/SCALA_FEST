package Basics

object PatternMatching2 {
  def main(args:Array[String]): Unit = {
    val result = search("Hello")
    println(result)
  }

  def search(a:Any):Any = a match {
    case 1 => println("One")
    case 2 => println("Two")
    case "Hello" => println("Hello")
    case _ => println("NON")
  }
}
