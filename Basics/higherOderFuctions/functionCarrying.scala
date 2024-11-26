package Basics.higherOderFuctions

object functionCarrying {
  def add(a:Int)(b:Int): Int = {
    a+b
  }
  def main(args: Array[String]): Unit = {
    val result = add(10)(10)
    println("10 + 10 = "+result)
    val addIt = add(10) _
    val result2 = addIt(3)
    println("10 + 3 = "+result2)
  }
}
