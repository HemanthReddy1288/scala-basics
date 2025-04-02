package function

object Functions extends App{
  def add(x: Int, y: Int): Int = {
    return x + y

  }
  def subtract(x: Int, y: Int): Int = {
    x - y
  }
  def multiply(x: Int, y: Int): Int = x * y
  def div(x: Int, y: Int) = x / y

  println(add(5, 7))
  println(subtract(45, 78))
  println(multiply(300, 35))
  println(div(222, 12))


}
