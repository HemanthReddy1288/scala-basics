package task.of25

//Write a function flattenList that flattens a nested list structure.
// A nested list can contain sublists of arbitrary depth. Use head, tail, and init in your solution.
//
//    Input: A nested list structure, e.g., List(1, List(2, 3), 4, List(5, List(6)))
//    Output: A flattened list, e.g., List(1, 2, 3, 4, 5, 6)
object FlattenList extends App{
  //case class flatten ( list: List[Int])
  def finalList (list2: List[Any]) : List[Any] ={
    list2 match {
      case Nil => Nil
      case (head : List[_]) :: tail => finalList(head) ::: finalList(tail)
      case head :: tail => head :: finalList(tail)
    }
  }
  println(finalList(List(1, List(2, 3), 4, List(5, List(6)))))
}
  

