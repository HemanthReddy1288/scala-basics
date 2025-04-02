package function

object Func extends App{
  def sum(x: Int, y: Int): Int = { x + y }
  println(sum(2,3))

  def square(x: Int): Int ={ x * x}
  println(square(2))

  def fun (a: Int,f: Int => Int): Int = {
    f(a)
  }
  val res = fun(5,square)
  println(res)
  println(fun(10,x=> x * x))
  println(fun(111,x=> x/10))
  println(fun(5, a => {val b = a + 5; b + b}))
  def change(x: String): String = {
    x.toUpperCase
  }
  println(change("abcdefg"))

  def fact(n:Int): Int = {
    if (n==0){
      return  1
    }
    return (n * fact(n-1))
    
  }
  println(fact(8))
}
