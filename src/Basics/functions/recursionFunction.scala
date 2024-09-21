package Basics.functions

object recursionFunction {
  def main(args:Array[String]): Unit = {
    val result = functionExample(15, 2)
    println(result)
  }

  def functionExample(a:Int, b:Int):Int = {
    if(b == 0)          // Base condition
      0
    else
      a+functionExample(a,b-1)
  }
}
