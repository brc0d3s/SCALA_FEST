object NamesPrinter {
  def main(args: Array[String]): Unit = {
    printNames("Brian", "Titus", "Tevin")
  }

  def printNames(args: String*): Unit = {
    for (name <- args) {
      println(name)
    }
  }
}