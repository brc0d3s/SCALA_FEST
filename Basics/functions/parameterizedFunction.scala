package Basics.functions

object parameterizedFunction {
  def main(args:Array[String]): Unit = {
    adder(20.9,45.4)
  }

  def adder(a:Double,b:Double): Unit = {
    val c = a + b
    println(c)
  }
}
