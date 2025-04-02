package curring

object PartialApplication extends App {
  def multiply(a: Int)(b: Int): Int = a * b
  val multiplyByTwo = multiply(2)
  println(multiplyByTwo(2))
}
