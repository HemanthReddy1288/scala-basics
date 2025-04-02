package leetcode

object Intersection extends App{
  def names(a: List[Int],b : List[Int]): List[Int] = {
    a.intersect(b)

  }
  println(names(List(1,2,3,4),List(3,4,5,6)))
}
