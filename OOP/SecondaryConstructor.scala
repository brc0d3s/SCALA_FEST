class Person(var name:String,var age:Int){
    // secondary constructor
    def this(name:String)={
        this(name,10) // Calls the primary constructor with default age
    }

    def showDetails(): Unit = {
        println(s"Name: $name, Age: $age")
    }
}

object SecondaryConstructor{
    def main(args: Array[String]): Unit = {
        val p = new Person("Brian",56)
        p.showDetails()
        val p2 = new Person("Kevin")
        p2.showDetails()
    }
}