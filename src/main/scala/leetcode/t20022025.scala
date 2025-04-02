package leetcode

import scala.collection.mutable

object t20022025 extends App {
  //Print all prime numbers between 1 and 100.

  val primeNumbers = for (i <- 1 to 100)
    if (i % 2 == 0) {
      print(i + " ")
    }
  //_______________________________________________________________________________________

  //Write a Scala program to reverse a given number.

  val x = List(1, 2, 3, 4, 5, 6, 7, 8)
  println("-------")
  println(x.reverse)
  //Given a list of integers, filter out even numbers and square the remaining ones.
  val x2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
  val x3 = x2.filter(_ % 2 == 0).map(c => c * c)
  println(x3)
  //Implement a function that counts occurrences of each word in a given sentence.


}
