package collectionListApi

object Combination extends App{
  val list1=List(1,2,3,4,5,6)
  val comb = list1.combinations(2).toList
  println(comb)
  val result = comb.flatten
  println(result)
}
