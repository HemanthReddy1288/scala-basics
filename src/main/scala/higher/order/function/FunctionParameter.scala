package higher.order.function

object FunctionParameter extends App{
  def apply(x: Int, y: Int, z: Int, f:(Int,Int)=>Int):  Int = {
    f(f(x,y),z)
  }
  val sum = (a: Int,b: Int) => a + b
  val product = (a: Int,b: Int) => a * b
  println(apply(2,3,6,sum))
  println(apply(34,65,76,product))
}
