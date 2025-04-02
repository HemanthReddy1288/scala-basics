package leetcode

object Factorial extends App{
  def number(Num: Int): Int= {
  if (Num==0) 1
  else (Num * number(Num-1) )
  }
  println(number(5))
}
