import scala.collection.mutable.ArrayBuffer

object ArrayBufferExample {
  def main(args: Array[String]): Unit = {
    // Case class to hold student details
    case class StMarks(name: String, gender: String, cat1: Int, cat2: Int, exam: Int)

    // Function to return the sum of the scores
    def sum(m1: Int, m2: Int, m3: Int): Int = m1 + m2 + m3

    // Function to return the grade based on the total marks
    def grade(mark: Int): String = {
      if (mark >= 70) "A"
      else if (mark >= 60) "B"
      else if (mark >= 50) "C"
      else if (mark >= 40) "D"
      else "F"
    }

    // Importing ArrayBuffer and creating it to store StMarks
    val marks = ArrayBuffer[StMarks]()
    
    // Adding a StMarks record to the array Buffer marks
    marks += StMarks("Faith", "F", 9, 11, 33)
    
    // Adding a list of StMarks records to the array Buffer marks
    marks ++= List(
      StMarks("Joyce", "F", 5, 18, 35),
      StMarks("John", "M", 7, 8, 28),
      StMarks("Joseph", "M", 8, 12, 38)
    )

    // Printing the first record in the array Buffer
    println("Head of marks: " + marks.head)

    // Printing all the records in the array Buffer
    marks.foreach(println)

    // Printing just student names
    marks.foreach(m => println(m.name))

    // Printing the sum of the cats and exams
    marks.foreach(m => println(m.cat1 + m.cat2 + m.exam))

    // Printing the sum of the cats, exams, and the names
    marks.foreach(m => println(m.name + "\t" + (m.cat1 + m.cat2 + m.exam)))

    // Call the grade function which itself calls the sum to print names and grades
    marks.foreach(m => println(m.name + "\t" + grade(sum(m.cat1, m.cat2, m.exam))))

    // Call the grade function and print names, total sum, and grades
    marks.foreach(m => println(m.name + "\t" + sum(m.cat1, m.cat2, m.exam) + "\t" + grade(sum(m.cat1, m.cat2, m.exam))))
  }
}
