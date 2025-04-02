package leetcode

import collection.Iterators.i

import scala.collection.immutable.BitSet.empty.foreach

object T12022025 extends App{
  //Reverse a string.
  val x = "string"
  val res = x.reverse
  println(res)
  //Find the maximum element in a list.
  val list = List(99,45,55,345,321,897,999)
  println(list.max)
  //Check if a number is prime.
  val value = 77
  val res2 = if(value %2 != 0) println(s"$value is prime number")
  else println(s"$value is not prime number")
  //Find the factorial of a number.
  def number(num : Int) : Int = {
    if (num == 0 ) 1
    else num * number(num - 1)
  }
  println(number(5))
  //Compute the sum of all elements in a list.
  val list2 = List(123,4,567,890,654,35)
  println(list2.sum)

  //Find the second largest element in a list.
  def func2 ( list3 : List[String]) : Int = {
    var count1: Int = 0
    for (i <- list3) {
      var len = i.length
      if (len > count1)
        count1 = len
    }
    count1
  }
  println(func2(List("ab","abcd","abcde","abcdef")))
  //Generate the Fibonacci sequence up to n terms.

  //Group consecutive identical elements in a list.

  //Count the occurrences of each element in a list.
  def func4(num2 : List[Int]) : Map[Int,Int] ={
    val part1 = num2.groupBy(identity)
    val part2 = part1.view.mapValues(_.size).toMap
    part2
  }
  println(func4(List(1, 1, 2, 3, 3, 3, 4, 1, 1, 2)))

  //Check if a string is a palindrome.
  def name(N: String) : Boolean ={
    val m = N.reverse
    N == m
  }
  println(name("madam"))
  //Write a function to check if a number is even or odd.
  def number2(num: Int) : String ={
    if(num%2 ==0) s"even"
    else s"odd"
  }
  println(number2(33))
  //Find the sum of digits of a number.

  //Merge two sorted lists into one sorted list.
  def list(sortedlist1 : List[Int],sortedlist2 : List[Int]) : List[Int] = {
    val updating = sortedlist1 ++ sortedlist2
    val sorting = updating.sorted
    sorting
  }
  println(list(List(1,3,5),List(2,4,6)))


  //Count the number of vowels in a string

  //Remove duplicates from a list.
  val list6 = List(1,2,2,3,3,4,4,45,5,6,6,67,7)
  println(list6.distinct)
  //Convert a list of integers to their string representation.
  val list7 = List(1,2,3,4,5,6,7,0,8,9)
  println(list7.mkString)
  //Find the last element of a list.
  //Find the second-to-last element of a list.
  //Compute the product of all elements in a list.
  //Find the nth Fibonacci number.

}
