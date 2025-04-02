package collectionListApi

object Distinct extends App{
  def list(num: List[Int]): List[Int] = {
    num.distinct
  }
  println(list(List(34,34,56,65,77,7,2,3,1,2,3,5,6,7,6,5,4,5,8,9)))
}
