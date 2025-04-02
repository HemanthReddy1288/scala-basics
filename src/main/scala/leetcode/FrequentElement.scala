//package leetcode
//
//object FrequentElement extends App{
//  def pascalsTriangle(n: Int): List[List[Int]] = {
//    (0 until n).map { i =>
//      (0 to i).map(j => if (j == 0 || j == i) 1 else pascalsTriangle(i - 1)(j - 1) + pascalsTriangle(i - 1)(j)).toList
//    }.toList
//  }
//  println(mostfrequent(List(1, 2, 3, 2, 2, 4, 4, 4, 4, 5)))
//}
