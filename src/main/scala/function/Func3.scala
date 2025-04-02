package function

object Func3 extends App{
  val b = (x: Int) => x * x
  println(b(10))
  val c = b(33) + 2
  println(c)

  def square(a: Int): Int ={ a * a}
  def func( x: Int,f: Int => Int) : Int = {
    f(x)
  }
  val res1 = func(3, square)
  println(res1)
  val res2 = func(3, x => x + x )
  println(res2)

  def addIt(a: Int): Int = { a + a}
  def squit(a: Int): Int = { a * a}
  val res3 = addIt(3)
  println(res3)
  val res4 = squit(addIt(3))
  println(res4)

    var f = 3
    def x = (i: Int) => i + f
    f = 10
    println(x(10))




}

