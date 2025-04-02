package leetcode

object EvenOdd extends App{
  val list = List (22,34,56,76,77)
  println(list.filter(_%2==0))

  def number(num: Int): Boolean =  num % 2==0
  println(number(66))
}
