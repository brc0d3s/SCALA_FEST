class Person(var fName:String,var lname:String){

}

object ClassConstructor{
  def main(args: Array[String]): Unit = {
    val p = Person("Brian","Omondi")

    println(s"Name: ${p.fName} ${p.lname}")
}
}