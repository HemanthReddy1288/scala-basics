package task.of25


//Write a Scala program to exchange the first and last characters
// in a given string and return the new string.
object ExchangeTheFirstAndLast extends App{

  def name(x : String) : String ={
    val xLength = x.length
    val fristLitter = x.charAt(0)
    val lastLitter = x.charAt(xLength-1)
    val middleLitters = x.substring(1,xLength-1)
    lastLitter + middleLitters + fristLitter
  }
  println(name("hello World"))

  def names(y : String) : String ={
    val headValue = y.head
    val middleValue = y.tail.init
    val lastValue = y.last
    lastValue + middleValue + headValue
  }

  println(names("world"))

}
