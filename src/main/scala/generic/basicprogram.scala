package generic

object Utils extends App {
  def identity[T](x: T): T = x


  println(Utils.identity(42)) // Output: 42
  println(Utils.identity("Hello"))
}
