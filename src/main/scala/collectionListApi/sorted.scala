package collectionListApi

object sorted extends App{
  val number = List(14,6,78,54,34,21,75,24,18)
  val result=number.sorted
  println(result)
  val result2= number.sortWith(_>_)
  println(result2)

}
