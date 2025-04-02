package leetcode

object Fibonacci extends App{
  def fibon(n: Int) : Int = {
    def helper(n: Int, a: Int, b: Int): Int = {
      n match {
        case 0 => 0
        case 1 => 1
        case _ => println(a + " "); helper(n - 1, b, a + b)

      }
    }

    helper(n, 0, 1)
  }
  fibon(9)
}
