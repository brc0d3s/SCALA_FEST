package Basics.higherOderFuctions

object multilineExpression {
  def main(args:Array[String]): Unit = {
      println(add(20.9,45.7))
    println(mult(34.8,98.7))
  }

  def add(var1:Double,var2:Double): Double = {
    (var1
      +var2)
  }

  def mult(var3:Double,var4:Double): Double = {
    var3*
      var4
  }
}
