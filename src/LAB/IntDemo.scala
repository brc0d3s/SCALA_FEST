package LAB


object IntDemo{
  def main(args:Array[String]){
  
    var i:Int = 0
    var sum:Int = 0
   
    for(arg <- args){
      sum =sum +  Integer.valueOf(args(i))
      println("[" + i + "] = " + arg)
      i += 1
     }
    println("Sum is \t" + sum)
 }
}
