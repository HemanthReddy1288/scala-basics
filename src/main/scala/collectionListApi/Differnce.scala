package collectionListApi

object Differnce extends App{
  val list1 = List(1,2,3,4,5)
  val list2 = List(3,5,6,7,8)
  val list=list1.diff(list2)
  println(list)

  val result = list1 ::: list2
  println(result)

}
