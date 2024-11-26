import scala.util.Random

object StudentScoreCard {
    def main(args: Array[String]): Unit = {
        val studentNo = 1045858
        val firstName = "Brian"

        // Create a partially applied function by fixing `stNum` and `stName`
        val partialPrintScorecard = printScorecard(studentNo, firstName, _: Int, _: Int, _: Int, _: Int)

        for (_ <- 1 to 8) {
            val cat1 = Random.nextInt(10)
            val cat2 = Random.nextInt(20)
            val exam = Random.nextInt(70)
            val grade = cat1 + cat2 + exam

            // Use the partially applied function
            partialPrintScorecard(cat1, cat2, exam, grade)
        }
    }

    def printScorecard(stNum: Int, stName: String, cat1: Int, cat2: Int, exam: Int, grade: Int): Unit = {
        println(s"$stNum\t$stName\t$cat1\t$cat2\t$exam\t$grade")
    }
}
