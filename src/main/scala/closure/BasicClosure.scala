package closure

object BasicClosure extends App{
  var factor = 2
  val multiply = (x: Int) => x * factor
  println(multiply(5))
  factor = 6
  println(multiply(5))
}
