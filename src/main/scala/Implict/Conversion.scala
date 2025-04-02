package Implicts

import scala.language.implicitConversions

object Conversion {
  implicit def intToString(x: Int) : String = {
    (x.toLong).toString
  }
  def printString(s:String) : Unit ={
    println(s)
  }
  def main(Args :Array[String]) : Unit ={
    printString(100)
  }
}
