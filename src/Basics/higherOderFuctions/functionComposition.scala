package Basics.higherOderFuctions

object functionComposition extends App{

  val result = multBy2(add2(10))
  println(result)


  def add2(a:Int): Int ={
    a + 2
  }

  def multBy2(b:Int): Int ={
    b * 2
  }
}
