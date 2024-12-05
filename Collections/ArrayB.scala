import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object ArrayB{
    def main(args: Array[String]): Unit = {
        
        var cat1 = ArrayBuffer[Int]()
        var cat2 = ArrayBuffer[Int]()
        var exam = ArrayBuffer[Int]()
    

        
        for(_<- 1 to 10){
            cat1 += Random.nextInt(9) + 2
            cat2 += Random.nextInt(16) + 5
            exam += Random.nextInt(51) + 20
        }

        println("Cat1:\n")
        cat1.foreach(println)
        println("Cat2:\n")
        cat2.foreach(println)
        println("Exam:\n")
        exam.foreach(println)
    }
}