package collectionListApi

object GroupBy extends App{
  val list1 = List(1,2,4,5,6,7,89,9,8)
  val result = list1.groupBy(_%2)
  println(result)
}
