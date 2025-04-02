package collectionListApi

object EndsWith extends App{
  val number = List(1,2,3,4,5)
  val result = number.endsWith(List(2,3))
  println(result)
}
