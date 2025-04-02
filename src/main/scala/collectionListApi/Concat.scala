package collectionListApi

import collection.List02

object Concat extends App{
  val list1= List(1,2,3,4,5,6,7,8,9)
  val list2= List(11,22,33,44,55,66,77,88,99)
  val result=list1 ++ list2
  val result2 = list1.concat(list2)
  println(result)
  println(result2)
}
