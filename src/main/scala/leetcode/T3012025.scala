package leetcode

object T3012025 extends App{
  val res = Array("a","b","c")
  val result = res.zipWithIndex.toMap
  println(result)
  println(result("a"))

  val list = List(1,2,4,6,7,8,65,9)
  val x = list.tail
  val y = list.init
  println(x.max)
  println(y.max)
  println(y.reverse)

  val res2 = Array("a","b","c")
  println(res2(2))

  val res3 = List(1,2,3,4,5,6,67)
  println(res3(2))



}
