package task.of25

import scala.+:

//Write a function reverseList that reverses the list without using the built-in reverse function.
// Use head, tail, and init to implement the solution.
//
//    Input: A list of integers.
//    Output: A new list that is the reverse of the original list.
object reverse extends App{
//  def reverseList(list: List[Int]) : List[Int] ={
//    list match {
//      case head =>
//      case head :: tail => list.last :: reverseList(list.init)
//    }
//  }
//  println(reverseList(List(1,2,3,4,5)))





  def reverseList1(list: List[Int]) : List[Int] ={
    list.foldLeft(list.empty)((acc,x) => x +: acc)
  }
  println(reverseList1(List(1,2,3,4,5)))
  
  
  def reverseListMyWay(list:List[Int],res:List[Int]=Nil):List[Int]={
    list match {
      case head :: Nil => head :: res
      case head:: tail => reverseListMyWay(tail,head :: res)
    }
  }
  
  println(reverseListMyWay(List(1,2,3,4,5)))
}
