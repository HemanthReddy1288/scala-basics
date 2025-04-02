package leetcode

object NumberisPrime extends App{
  def isPrime(n:Int): Boolean = {
    if(n < 2) false
    else(2 until n ).forall(n  % _ != 0)
  }

  println(isPrime(11))
  println(isPrime(10))
  def Factorial(n: Int) : Int = {
    if (n == 1) 1
    else (n * Factorial(n - 1))

  }
  println(Factorial(5))
}
