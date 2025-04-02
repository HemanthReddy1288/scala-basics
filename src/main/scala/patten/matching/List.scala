package patten.matching

object Lists extends App {
  val list2 = List(1,2,3,4,5,6,7)
  val res = list2 match {
    case Nil => s"empty list"
    case head :: Nil => s"Single element: $head"
    case head :: tail => s"Head: $head, Tail: $tail"
  }
  println(res)

}
