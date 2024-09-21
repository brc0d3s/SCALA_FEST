package Basics

object doWhileLoop {
  def main(args:Array[String]): Unit = {
    var var1 = 20

    do{
      println(var1)
      var1 += 5
    } while (var1 <= 50)
  }
}
