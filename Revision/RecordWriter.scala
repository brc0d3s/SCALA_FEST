import java.io.{File, PrintWriter}
import scala.util.Random
import scala.io.Source

object RecordWriter {
  def main(args: Array[String]): Unit = {
    val fileWriter = new PrintWriter(new File("result.txt"))

    for (_ <- 1 to 10) {
      val cat1 = Random.nextInt(11) 
      val cat2 = Random.nextInt(21)
      val exam = Random.nextInt(71) 
      fileWriter.println(s"$cat1\t$cat2\t$exam")
    }

    fileWriter.close()

    for (line <- Source.fromFile("result.txt").getLines()) {
      println(line)
    }
  }
}