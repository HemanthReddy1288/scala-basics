package leetcode

object LengthOfTheList extends App{
  val list= List(1,2,4,665,76,87,9,76,43,245,678,7654,45,321,12,45,76,78,90,76,45,32,45,98)
  println(list.length)
  val words = ("wpllos wqrld ")
  val res = words.split(" ")maxBy(_.length)
  val res1 = words.split(" ").max
  println(List(1,2,3,4).max)
  println(s"Res is ${res}")
  println(res1)




}
