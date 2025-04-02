package leetcode

object SecondLargestNumber extends App{
  def number(num: List[Int]): Unit = {
    val res = num.sorted.reverse
    val res2= res(1)
    println(res2)

  }
  number(List(88,45,23,98,93))
  number(List(1,2,3,4,5,6,7,8,9))



}
