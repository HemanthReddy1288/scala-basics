package task.of25

//Write a function reverseList that reverses the list without using
// the built-in reverse function. Use head, tail, and init to implement the solution.
//
//    Input: A list of integers.
//    Output: A new list that is the reverse of the original list.


object ReverseList extends App{
  def reverseList(list : List[Int], acc : List[Int] = List.empty) : List[Int] ={
    list match {
      case Nil => acc
      case head :: Nil => reverseList(list.init,acc :+ list.head)
      case head :: tail => reverseList(list.init,acc :+ list.last)
    }
  }
  println(reverseList(List(1,2,3,4,5)))

}
