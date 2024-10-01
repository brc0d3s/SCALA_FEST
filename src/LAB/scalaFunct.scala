package LAB

object scalaFunct extends App{
  println(max(10,39))

  def max(x:Int,y:Int): Int={
     if(x>y) x
    else y
  }

}
