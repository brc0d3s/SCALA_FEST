package LAB

object StringExample{
  def main(args:Array[String]){
    printStrings("Hello","Scala","Python")
  }

  def printStrings(args:String*) = {
    var i: Int = 0

    for(arg <- args){
      println("Arg value["+ i +"] = " + arg)
      i += 1
    }
  }
}
