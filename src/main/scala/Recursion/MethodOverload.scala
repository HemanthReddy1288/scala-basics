package Recursion

object MethodOverload extends App{
  def fun(p:Int,q:Int): Unit = {
    var sum=p+q
    println("Sum in function is:" + sum)
  }
  fun(10,11)
}
