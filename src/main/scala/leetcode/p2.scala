package leetcode

object p2 extends App {
  def isprime(n: Int): Boolean = (2 until n).forall(x => n % x != 0)

  def prime2(start: Int, end: Int): List[Int] = {
    (start to end).filter(isprime).toList

  }

  println(prime2(10, 50))

  def names(name: String): String = {
    name.groupBy(identity).map(i => s"${i._1} -> ${i._2.length}, ").mkString
  }
  println(names("aabbhedns"))

  val list1 = List(34,54,55,78,99)
  val x = list1.sum
  val x1 = x/list1.length
  println(x1)

  def num(n: Int): Boolean = {
    if (n % 2 == 0) true
    else false
  }
  println(num(57))

  def operation(num1: Int,Oper :Char, num2 : Int): Any = {
    Oper match {
      case '+'=> num1 + num2
      case '-' => num1 - num2
      case '*' => num1 * num2
      case '/' => num1/num2
      case _ =>  s" "
    }
  }
  println(operation(2,'*',5))

  def nums(a: List[Int]): List[Int] ={
    a.filter(c => c >= 0)
  }
  println(nums(List(-1,-56,-89,-99,3,5,6,78,99,0)))

  def words(a: String) : String = {
    a.split(" ").maxBy(_.length)
  }
  println(words("hello world"))












}