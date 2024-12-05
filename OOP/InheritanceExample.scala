class Rectangle(val length: Int, val width: Int) {
  // Method to calculate area of the rectangle
  def area(): Unit = {
    val rectArea = length * width
    println(s"Area of the rectangle: $rectArea")
  }
}

class Box(override val length: Int, override val width: Int, val height: Int) 
    extends Rectangle(length, width) {
  // Overloaded method to calculate the volume of the box
  def volume(): Unit = {
    val boxVolume = length * width * height
    println(s"Volume of the box: $boxVolume")
  }
}

object InheritanceExample {
  def main(args: Array[String]): Unit = {
    // Create a Rectangle instance
    val rect = new Rectangle(10, 5)
    rect.area() // Should print: Area of the rectangle: 50

    // Create a Box instance
    val box = new Box(10, 5, 8)
    box.area()   // Should print: Area of the rectangle: 50 (inherited method)
    box.volume() // Should print: Volume of the box: 400 (new method)
  }
}
