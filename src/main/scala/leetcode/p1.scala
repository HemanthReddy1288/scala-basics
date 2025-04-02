package leetcode

object p1 extends App {
  def longestWord(seng: String): String = {
    seng.split(" ").maxBy(_.length)
  }

  println(longestWord("Scala is a powerful functional programming language"))

  def num(a: Int, b: Int): Int = a + b

  println(num(2, 3))

  val arrays = Array(344, 654, 678, 87, 88, 98, 34, 98)
  println(arrays.max)

  def prime(num: Int): Boolean = {
    if (num < 2) false
    else (2 until num).forall(_ % 2 != 0)

  }

  println(prime(2))

  def Factorial(n: Int): Int = {
    if (n == 1) 1
    else (n * Factorial(n - 1))

  }

  println(Factorial(5))

  def name(num: String): Boolean = {
    val res = num.reverse
    num == res
  }

  println(name("madam"))

  val names = "helloworld computer"
  val set = "aeiouAEIOU"
  val res = names.filter(c => set.contains(c)).length
  println(res)

  val arr = Array(1, 2, 3, 4, 5)
  val ress = arr.tail
  println(ress.max)

  def namess(num : List[Int]): List[Int] = {
    num.distinct
  }
  println(namess(List(1,3,4,3,4,5,6,7,65,6,7,8,6)))

  val list1 = List(1,2,3,4,5,6)
  val list2 = List(4,5,6,7,8,9)
  val result = list1.intersect(list2)
  println(result)

  val arrys = Array(1,3,56,76,87,3,423,67)

  val data = "aaabbcc"
  //val x=data.groupBy(identity).map(x=>s"${x._2.length}${x._1}").mkString
  //println(x)
  val x= data.groupBy(identity).map(x => s"${x._2.length}${x._1}").mkString
  println(x)





}