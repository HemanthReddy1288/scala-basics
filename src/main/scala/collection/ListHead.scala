package collection

object ListHead extends App{
  val mylist=List("c","c++","java","scala")


  println(mylist.head)
  println(mylist.tail)
  println(mylist.isEmpty)
  println(mylist.reverse)
  val mylist2 = mylist.reverse
  println(mylist2.head)
  val mylist3 = mylist.length
  println(mylist(mylist3 - 2))

}
