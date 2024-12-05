class Point(val xc:Int,val yc:Int){
   var x=xc
   var y=yc

   def move(dx:Int,dy:Int)={
    x = x + dx
    y = y + dy

    println(s"New x: $x")
    println(s"New y: $y")
   }
}

object PointClass{
    def main(args:Array[String]) ={
        val pt = new Point(56,78)

        pt.move(5,6)
    }
}


