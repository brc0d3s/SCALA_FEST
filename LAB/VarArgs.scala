object VarArgs{
    def main(args: Array[String]): Unit = {
        printInts(34,56,78,45,67,89,23)


        def printInts(args:Int*)={
            var sum = 0

            for(arg <- args){
                println(arg)
                sum = sum + arg
            }
            println(s"The sum is ${sum}")
        }
    }
}