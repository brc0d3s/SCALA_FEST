package Basics.functions

object parameterizedFunction {
  def main(args:Array[String]){
    adder(20.9,45.4)
  }

  def adder(a:Double,b:Double){
    val c = a + b
    println(c)
  }
}
