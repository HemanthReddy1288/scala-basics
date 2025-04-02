package leetcode

case object fristNoddnumber extends App{
  def numbers(num: Int) : List[Int] = {
    (1 to (num * 2) by 2).toList
  }
  println(numbers(5))
  val words = List("Scala", "Java", "Sython", "C")

  val longestWord = words.max
  println(longestWord)
}
