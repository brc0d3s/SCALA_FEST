package Basics.higherOderFuctions

object nestedFunction {
  def add(a:Int, b:Int, c:Int): Int = {
    def add2(x:Int,y:Int) = {
      x+y
    }
    add2(a,add2(b,c))
  }
  def main(args: Array[String]): Unit = {
    var result = add(10,10,10)
    println(result)
  }
}
