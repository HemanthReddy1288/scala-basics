package D

import collection.Sequence.list


object Hello extends App {

  def helper(list: List[Int], acc: Int, findMin: Boolean): Int = {
    if (list.isEmpty) acc
    else {
      val head = list.head
      val newAcc = if ((findMin && head < acc) || (!findMin && head > acc)) head else acc
      helper(list.tail, newAcc, findMin)
    }
  }

  def mainmethod(list3: List[List[Int]]): Int = {
    val minValues = list3.map(lst => helper(lst.tail, lst.head, findMin = true)) // Find min in each sublist
    helper(minValues.tail, minValues.head, findMin = false) // Find max among them
  }

  println(mainmethod(List(List(1, 20), List(4, 6), List(8, 9)))) // Output: 8
}