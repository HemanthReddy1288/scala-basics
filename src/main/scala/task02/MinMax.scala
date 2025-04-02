package task02

import scala.Byte.MaxValue
import scala.annotation.tailrec

object  hello extends App {
  def helper(list: List[Int], acc: Int = Integer.MAX_VALUE): Int = {
    if (list.isEmpty)  acc
    else {
      val head = list.head
      val tail = list.tail
      if (acc < head) helper(tail, acc)
      else {
        helper(tail, head)
      }
    }
  }

  @tailrec
  def helper2(list2: List[Int], acc: Int = Integer.MIN_VALUE): Int = {
    if (list2.isEmpty)  acc
    else {
      val head = list2.head
      val tail = list2.tail
      if (acc > head) helper2(tail, acc)
      else {
        helper2(tail, head)
      }
    }
  }


  def mainmethod(list3: List[List[Int]]): Int = {
    val check1 = list3.map(c => helper(c))
    val check2 = helper2(check1)
    check2
  }
  println(mainmethod(List(List(1, 20), List(4, 6), List(8, 9))))



}
