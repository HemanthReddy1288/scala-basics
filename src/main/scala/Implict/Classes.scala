package Implict

object Classes extends App {
  implicit class RichInt(val x : Int) {
    def square: Int = x * x
  }
  println(5.square)


  val number : Option[Int] = Some(22)
  val result = number.getOrElse(0)
  println(result)

  val fristNumber = None
  val secondNumber = Some(20)
  val result1 = fristNumber.orElse(secondNumber)
  println(result1)
}
