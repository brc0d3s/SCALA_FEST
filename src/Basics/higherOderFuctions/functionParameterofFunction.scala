package Basics.higherOderFuctions

object functionParameterofFunction {
  def main(args:Array[String]): Unit = {
      functParameter(25,multBy2)
  }

  def functParameter(a:Int,f:Int => AnyVal): Unit ={
    println(f(a))
  }

  def multBy2(b:Int): Int ={
    b * 2
  }
}
