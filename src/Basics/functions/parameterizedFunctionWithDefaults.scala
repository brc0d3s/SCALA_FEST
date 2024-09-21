package Basics.functions

object parameterizedFunctionWithDefaults {
  def main(args:Array[String]): Unit = {
    println(defaultFuntion(23,10.2))
    println(defaultFuntion(10,1.1))
    println(defaultFuntion())


  }

  def defaultFuntion(a: Int = 5, b: Double = 56.8): Double = {
    a+b
  }
}
