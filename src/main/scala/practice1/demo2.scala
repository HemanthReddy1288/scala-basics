package practice1

object demo2 extends App {


 // Write a Scala program to swap two variables without using a third variable.
 var a = 10
 var b = 20

 a = a + b
 b = a - b
 a = a - b
 println(s"a = $a, b = $b")

 //Write a function that takes a number and returns whether it is positive, negative, or zero
 def numb(num: Int): String = {
  if (num > 0) {
   (s"positive")
  }
  else if (num > 0) s"negitive"
  else s"zero"


 }

 println(numb(33))

 def name(x: String): String = {
  x.reverse
 }

 println(name("helloworld"))

 val name = "abcious"
 val xy = name.replaceAll("[aeiouAEIOU]", "")
 println(xy)
 val yx = name.replace("o", "W")
 println(yx)

 //Write a program that prints the first 20 numbers in the Fibonacci series.
 def Fibonaccci(n: Int): Int = {
  def helper(n: Int, a: Int, b: Int): Int = {
   n match {
    case 0 => 0
    case 1 => 1
    case _ => print(a + " "); helper(n - 1, b, a + b)
   }

  }

  helper(n, 0, 1)
 }

 Fibonaccci(20)
 println("___________________")

 //Write a Scala program to check if a given year is a leap year.
 //Write a function that prints the multiplication table of a given number.
 def number(num: Int, limit: Int = 10): Unit = {
  for (i <- 0 to limit) {
   println(s"$num * $i = ${num * i}")
  }
 }

 number(5)

 //Write a program that finds the sum of all even numbers between 1 and 100.
 def evennumbers(start: Int, end: Int): Int = {
  (start to end).filter(_ % 2 == 0).sum
 }

 println(evennumbers(1, 100))

 //Implement a function that finds the greatest common divisor (GCD) of two numbers using recursion.

 def GCD(a: Int, b: Int): Int = {
  if (b == 0) a
  else GCD(b, a % b)
 }

 val res = GCD(12, 0)
 val res2 = GCD(56, 98)
 println(res)
 println(res2)

 //Write a program that finds the sum of digits of a number using recursion.
 def abcd(n: Int): Int = {
  if (n == 0) 0
  else (n % 10) + abcd(n / 10)
 }

 println(abcd(234))

 //Write a function that removes duplicates from a given list
 val list1 = List(1, 1, 22, 3, 34, 100, 56, 43, 43, 56, 5, 76, 76, 34, 3)
 println(list1.distinct)

 //Find the second largest number in a given list of integers.

 val list2 = List(81, 72, 673, 92, 82, 77, 7, 99, 100)
 val res3 = list2.sorted.reverse
 val res4 = res3.tail.max
 println(res4)

 //Reverse a list without using the built-in reverse method

 val list3 = List(1, 2, 3, 4, 5, 6)
 val list4 = list3.reverse
 println(list4)
 //Given a list of words, return a new list with only the words that start with the letter 'S'.
 val words = "star stop end and some "
 val res5= words.split(" ").filter(c=>c.startsWith("s")).toList
 println(res5)
//Implement a function that rotates a list left by n positions.

 //Write a function that takes a list of numbers and returns a new list with each number squared.
 def number(a : Int ,f:(Int)=>Int): Int = { f(a)}
 def f(x : Int): Int = {
  x*x
 }
 println(number(5,f))
 //Implement a function that takes a list of numbers and returns only the even numbers using filter.
 def funct(list: List[Int]) : List[Int] = {
  list.filter(_ % 2 == 0)

 }
 println(funct(List(1,2,3,4,5,6,7,8,9,0,11,22,33,44,55,666,77,88,99,12,34,55,67,89,9,87,65,43,21)))


}