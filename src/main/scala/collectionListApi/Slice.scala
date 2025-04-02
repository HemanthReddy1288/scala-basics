package collectionListApi

object Slice extends App{
  val list1  = List(1,3,5,7,8,3,9)
  val list2= list1.slice(1,7)
  println(list2)
}
