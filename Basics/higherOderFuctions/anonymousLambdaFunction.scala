package Basics.higherOderFuctions

/**
 * You can create anonymous function either by using => (rocket)
 * or _ (underscore) wild card in scala.
 */

object anonymousLambdaFunction {
  def main(args:Array[String]): Unit = {
    var result1 = (length:Int,width:Int) => length * width // Using rocket
    var result2 = (_:Int) * (_:Int) // Using underscore

    println(result1(20,30))
    println(result2(45,60))
  }
}
