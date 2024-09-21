package Basics

import scala.util.control.Breaks.{break, breakable}

object breakStatement {
  def main(args:Array[String]): Unit = {
    for(i <- 1 to 10){
      breakable{
        if(i == 5){
          break
        } else {
          println(i)
        }
      }
    }
  }
}
