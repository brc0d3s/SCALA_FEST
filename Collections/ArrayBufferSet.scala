import scala.collection.mutable.ArrayBuffer

object ArrayBufferSet{
    def main(args: Array[String]): Unit = {
        var r = ArrayBuffer[Int]()
        r ++= List(45,56,78)
        r += 100
        //r.foreach(println)

        for(num <- r){
            println(num)
        }
    }
}