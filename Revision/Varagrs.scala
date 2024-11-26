object Varagrs{
    def main(args:Array[String])={
        Stringargs(34,67,8,7,6,45,12,3,4)
    }

    def Stringargs(x:Int*):Unit={
       var sum = 0
       var i = 0

       for(arg <- x){
        println(s"[$i] = $arg")
        i += 1
        sum += arg
       }
       println(s"Sum = $sum")
    }
}