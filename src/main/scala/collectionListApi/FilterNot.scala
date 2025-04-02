package collectionListApi

object FilterNot extends App{
  val number = List(1,2,3,4,5,6,7,8,9,0)
//  val result = number.filterNot(_%2==0)
//  val max1 = number.max
//  val newMax = number.filterNot(_==max1).max
  val datamap = List("a","b","c").zipWithIndex.toMap
  val arr1 = Array(1,2,3)
  val arr2 = Array(1,2,3,4)
  val arr3 = arr2.map(x => arr1.filter(y => x == y).toList)
  println(arr3.toList)
  println(datamap("a"))
}

