package task.of25

//Write a function findMiddle that finds the middle element of a list.
// If the list has an even number of elements, return the average of the two middle elements.
// Use head, tail, init, and last as necessary.
//
//    Input: A list of integers.
//    Output: The middle element or the average of the two middle elements

object FindMiddles extends App{
  def findMiddle(list : List[Int]): Any ={
    list match {
      case Nil => s"No Data"
      case head :: Nil => s"middle value is $head"
      case head :: tail if(list.length % 2 == 0)  => s"${FindingMiddleValue(list)}"
      case head :: tail if(list.length % 2 != 0) => s"${FindingMiddleValue(list)}"
      case _ => s"undefind"

  }

  }

  def FindingMiddleValue(list2 :List[Int]): Int = {
    if(list2.length % 2 == 0){
      val FindingValue = (list2.length/2)
      list2(FindingValue)+ list2(FindingValue + 1)
    }else{
      val FindingValue = ((list2.length)/2)
      list2(FindingValue)
    }
  }

  println(findMiddle(List(9,22,44,77,99,777,44)))

}
