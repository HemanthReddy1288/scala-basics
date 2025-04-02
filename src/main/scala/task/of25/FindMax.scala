package task.of25

import scala.:+

//  Write a function findMax that takes a list of Option[Int] and
//  returns the largest value among the Some values,
//  or None if the list contains no Some.
//
//  You should implement this using flatten, map, and foldLeft
object FindMax extends App{
  def findMax(a : List[Option[Int]]) : Option[Int] = {
    a.flatten.foldLeft(None: Option[Int]) {
      case (None, a) => Some(a)
      case (Some(a), b) => Some(a.max(b))
    }

  }
  println(findMax(List(Some(1),Some(3),None,Some(999),Some(99))))
}
