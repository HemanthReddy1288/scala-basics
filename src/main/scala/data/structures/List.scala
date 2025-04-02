package data.structures

object Listss extends App{
  val list = List(1,2,3,4,5,67,87,98,"String")
    println(list.head)
    println(list.tail)
    val newList = 0 :: list
    println(newList)
  val newList2 = List(0,34,54,67) ::: list
  println(newList)
  newList2.foreach(println)
  val reversed = newList.reverse
  println(reversed)



}
