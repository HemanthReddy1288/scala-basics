package function

object PartiallyAppliedFunction extends App{
  val sum=(a: Int, b: Int, c: Int) => (a + b + c)
  val f=sum(10, _: Int, _: Int)
  println(f(20, 30))
  
  
  def math(a: Int, b: Int, c: Int): Int = a + b + c
  var result = math
  //println(result((5)(7)(6)))
  def app(a: String, b: String): String = a + b
  val result2 = app("hello", _: String)
  println(result2(" world"))





}

