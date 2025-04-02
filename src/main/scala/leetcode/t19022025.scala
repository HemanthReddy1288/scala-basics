package leetcode

object t19022025 extends App {
  //Write a Scala program to print "Hello, Scala!".
  val x = "Hello, Scala!"
  println(x)
  //Write a program that takes two integers as input and prints their sum.
  val x1 = List(23, 55)
  println(x1.sum)

  //Create a program that swaps two integer variables without using a third variable.

  var a = 10
  var b = 20
  a = a + b
  b = a - b
  a = a - b
  println(a)
  println(b)
  //Write a Scala program to check if a number is even or odd.
  val number = 22
  val x3 = if (number % 2 == 0) {
    println("number is even number")
  } else {
    println("number id odd number")
  }
  //Write a program that prints numbers from 1 to 50, but for multiples of 3 print "Fizz",
  // for multiples of 5 print "Buzz", and for multiples of both 3 and 5 print "FizzBuzz".
  //def mains (args: Array[String]): Unit = {
  //  val x4= for(i <- 1 to 50){
  //    (i%3,i%5).match{
  //      case(0,0) => println("FizzBuzz")
  //      case(0,_) => println("Fizz")
  //      case(_,0) => println("Buzz")
  //      }
  //    }
  //Write a function to calculate the factorial of a number using recursion.

  def recursion(x: Int): Int = {
    if (x == 0) 1
    else (x * recursion(x - 1))

  }

  println(recursion(5))
  //Write a program to find the sum of all elements in a list.
  val list = List(1, 2, 3, 4, 5, 6, 7, 8)
  println(list.sum)
  //Given a list of numbers, filter out only the even numbers.
  val list2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 23, 13, 14, 15, 16, 17, 18, 19)
  println(list2.filter(_ % 2 == 0))

  //Implement a function that takes a day of the week as a string and returns
  // whether it is a weekday or a weekend using pattern matching
  def days(day: String): Unit = {
    day match
      case "monday" | "tuesday" | "wednesday" | "thursday" | "friday" => println("weekday")
      case "saturday" | "sunday" => println("weekend")
  }

  days("monday")

  //Create a Scala map that stores student names as keys and their scores as values.
  // Write a function to safely retrieve a student's score using Option.
  val x5 = Map("a" -> 10, "b" -> 20, "c" -> 30, "d" -> 40)

  def safely(name: String): Option[Int] = {
    x5.get(name)
  }

  println(safely("b"))

}

case class people(name : String,Age: Int)

object mainnn extends App {
  def greets(people: people): String = {
    people.Age match {
      case age if age < 18 => s"hello,young one !"
      case age if age < 60 => s"hello ${people.name}"
      case _ => s"Greetings, wise one!"
    }
  }

  val person1 = people("Alice", 16)
  val person2 = people("Bob", 30)
  val person3 = people("Charlie", 65)

  println(greets(person1))
  println(greets(person2))
  println(greets(person3))

  //Write a function that reverses a given string.
  val a = "helloworld"
  println(a.reverse)
  //Write a program that counts the number of vowels in a given string.
  val  a2 = "abcdefaAE"
  val c = Set('a','u','i','o','e','A','U','I','O','E')
  println(a2.count(c.contains))

  //Find the largest of three numbers using if-else statements.
  val a1 = 123
  val b2 = 234
  val c3 = 345
  if(a1 > b2 && a1 > c3) println(a1)
  else if(b2 > a1 && b2 > c3) println(b2)
  else println(c3)
  //Write a program that finds the maximum and minimum values in a list.
  val list2 = List(1,2,3,4,5,6,7,8,9)
  println(list2.max)
  println(list2.min)
  //Given a list of integers, return a new list where each element is


  //Write a function that checks if a given string is a palindrome.
  def palindrome(x : String) : Boolean ={
    val y = x.reverse
    y == x
  }
  println(palindrome("ma'am"))
  //Implement a function that takes a list of integers and returns
  // a list of their squares using map.
  def func(list7 : List[Int]) : List[Int] = {
    list7.map(c => c * c)
  }
  println(func(List(1,2,3,4,5)))
  //Write a function that removes duplicates from a list.
  def dupl(list8 : List[Int]) : List[Int] ={
    list8.distinct
  }
  println(dupl(List(1,22,33,4,6,7,8)))
  //Find the second largest element in a list.
  val list9 = List(1,2,3,4,5,6,7,8)
  val list10 = (list9.reverse).tail
  val list11 = list10.max
  println(list11)

  //Implement a function that matches on different
  // types (Int, String, Boolean) and returns a response accordingly

  def matching(value : Any) : String ={
    value match{
      case i : Int => s"Int"
      case i : String => s"String"
      case i : Boolean => s"Boolean"
    }
  }
  println(matching("hello"))
  println(matching(44))
  println(matching(false))
  //Create a pattern-matching function that
  // checks if a list is empty, has one element, or has multiple elements.
  def matching2(list12 : List[Int]): String ={
    list12 match {
      case Nil => s"isEmpty List"
      case head :: Nil => s"it carrying only one element"
      case head :: tail => s"it carrying multiple element"
    }
  }
  println(matching2(List(2,4,6,8)))








}


