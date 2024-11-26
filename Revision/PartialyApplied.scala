import java.util.Date

object PartialyApplied {
    def main(args: Array[String]): Unit = {
        val date = new Date // Creating a date object
        
        log(date, "message1")

        Thread.sleep(1000) // Sleeping for 1000 milliseconds
        log(date, "message2")

        Thread.sleep(1000)
        log(date, "message3")
    }

    // A function that receives a message and the date and logs the message
    def log(date: Date, message: String): Unit = {
        println(s"$date ---- $message") // Using string interpolation
    }
}
