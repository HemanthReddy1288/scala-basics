package collectionListApi

object Flatten extends App{
  val list1= List(List(1,2,3,4,5),List(5,6,3,5),List(1,2,3,4,5))
  val next= list1.flatten
  println(next)
  println(next.sorted)
}
