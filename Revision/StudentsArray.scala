object StudentArray{
    def main(args: Array[String]): Unit = {
        var students = Array[String](5)
        students(0) = "Brian"
        students(1) = "Lucky"
        students(2) = "Tevin"
        students(3) = "jairo"
        students(4) = "Mathew"

        for(student <- students){
            println(student)
        }

    }   
}