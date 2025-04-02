package function

object Hof extends App{
  def math(a: Int, b: Int, c: Int,f: (Long,Int) => Int): Int = f(f(a, b),c)
  val sum = math(1,2,3,f)
  println(sum)


   def f(a:Long, b:Int): Int=
    {
      a+b
    }

    val s: (Long, Int) => Int = f
    val s2: Int = 4

    f(2, 3)
  val numbers = List(1,2,3,4,5,6)
  val sumOfSquares = numbers
    .filter(_%2 == 0)
    .map(x=> x * x)
    .reduce(_ + _)
  println(sumOfSquares)


}



