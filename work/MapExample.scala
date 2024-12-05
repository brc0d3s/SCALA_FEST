import scala.collection.mutable.Map

object  MapExample {
  def main(args: Array[String]): Unit = {

          
      // 1. Case class to hold student details
      case class StMarks(name: String, gender: String, cat1: Int, cat2: Int, exam: Int)
      
      // 2. Sum function to return total marks
      def sum(m1: Int, m2: Int, m3: Int): Int = m1 + m2 + m3
      
      // 3. Grade function to return grade based on total marks
      def grade(mark: Int): String = {
        if (mark >= 70) "A"
        else if (mark >= 60) "B"
        else if (mark >= 50) "C"
        else if (mark >= 40) "D"
        else "F"
      }
      
      // 4. Creating a mutable Map (student number as the key)
      val marks: Map[Int, StMarks] = Map()
      
      // 5. Adding a single `StMarks` record to the Map
      marks += (1 -> StMarks("Faith", "F", 9, 11, 33))
      
      // 6. Adding multiple `StMarks` records to the Map
      marks ++= Map(
        2 -> StMarks("Joyce", "F", 5, 18, 35),
        3 -> StMarks("John", "M", 7, 8, 28),
        4 -> StMarks("Joseph", "M", 8, 12, 38),
        5 -> StMarks("Michael", "M", 15, 16, 50),
        6 -> StMarks("Emma", "F", 20, 19, 60),
        7 -> StMarks("Chris", "M", 12, 14, 55),
        8 -> StMarks("Sophia", "F", 13, 15, 58),
        9 -> StMarks("Tom", "M", 10, 12, 45),
        10 -> StMarks("Lucy", "F", 18, 17, 65),
        11 -> StMarks("James", "M", 8, 7, 30),
        12 -> StMarks("Nancy", "F", 19, 14, 55),
        13 -> StMarks("Sam", "M", 20, 10, 60),
        14 -> StMarks("David", "M", 11, 10, 50)
      )
      
      // 7. Printing the first record in the map (arbitrarily chosen by the key)
      println("First student: " + marks(1))
      
      // 8. Printing all records in the map
      marks.foreach{ case (key, value) => println(s"Student $key: $value") }
      
      // 9. Printing just student names
      marks.foreach{ case (_, m) => println(m.name) }
      
      // 10. Printing sum of CATs and exam for each student
      marks.foreach{ case (_, m) => println(m.cat1 + m.cat2 + m.exam) }
      
      // 11. Printing names and their sum of marks
      marks.foreach{ case (_, m) => println(m.name + "\t" + (m.cat1 + m.cat2 + m.exam)) }
      
      // 12. Printing names, sum of marks, and grades
      marks.foreach{ case (_, m) => println(m.name + "\t" + sum(m.cat1, m.cat2, m.exam) + "\t" + grade(sum(m.cat1, m.cat2, m.exam))) }
      
      // 13. Printing names and grades using the grade function
      marks.foreach{ case (_, m) => println(m.name + "\t" + grade(sum(m.cat1, m.cat2, m.exam))) }
      
      // 14. Printing names, sum, and grade by calling the grade and sum functions
      marks.foreach{ case (_, m) => println(m.name + "\t" + sum(m.cat1, m.cat2, m.exam) + "\t" + grade(sum(m.cat1, m.cat2, m.exam))) }

  }
}
