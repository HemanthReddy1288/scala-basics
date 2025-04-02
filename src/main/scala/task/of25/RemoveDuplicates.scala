package task.of25

// Write a function removeDuplicates that removes duplicates
// from a list while preserving the order of elements.
// Use head, tail, and init in your implementation.
//
//    Input: A list with duplicate elements.
//    Output: A new list without duplicates
object RemoveDuplicates extends App{
  def removeDuplicates(list : List[Int]) : List[Int] ={
    list.distinct

  }
  println(removeDuplicates(List(1,2,4,5,7,2,7,5)))
}
