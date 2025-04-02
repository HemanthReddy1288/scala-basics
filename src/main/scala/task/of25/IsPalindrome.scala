package task.of25

//Write a function isPalindrome that checks if a list is a palindrome.
// A list is a palindrome if it reads the same forward and backward.
// You must use head, tail, init, and last in your solution.
//
//    Input: A list of integers.
//    Output: true if the list is a palindrome, false otherwise.
object IsPalindrome extends App{

  def isPalindrome (list: List[Int]) : String ={
    list match {
    case _ if(list == checkerFunction(list)) => s"true if the list is a palindrome"
    case _ if(list != checkerFunction(list)) => s"false"
  }
  }

  def checkerFunction(before : List[Int]) : List[Int]={
    before.reverse
  }
  println(isPalindrome(List(1,2,45,2,1)))

}
