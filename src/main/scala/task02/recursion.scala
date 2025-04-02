package task02

object hello2 extends App {
  def helper(list: List[Int]): Int = {
    val acc: Int = Integer.MAX_VALUE
    list.foldLeft(acc)((acc, x) =>
      if (acc < x) acc
      else x)
  }

  def helper2(list2: List[Int]): Int = {
    val acc2: Int = Integer.MIN_VALUE
    list2.foldLeft(acc2)((acc, x) =>
      if (acc > x) acc
      else x)
  }

  def mainmethod(list3: List[List[Int]]): Int = {
    val check1 = list3.map(c => helper(c))
    val check2 = helper2(check1)
    check2
  }

  println(mainmethod(List(List(1, 20), List(4, 6), List(8, 9))))

}
