package practice1
//
object Demo3 extends App {
    //Write a function that prints numbers from 1 to 100.
    //For multiples of 3, print "Fizz" instead of the number.
    //For multiples of 5, print "Buzz".
    //For multiples of both 3 and 5, print "FizzBuzz".
    val numbers = for (i <- 1 to 100) println(i)
    val multiple = for (i <- 1 to 100) {
      if (i % 3 == 0) println("Fizz")
      else if (i % 5 == 0) println("Buzz")
      else if (i % 3 == 0 && i % 5 == 0) println("FizzBuzz")
      else println()
    }
    println(multiple)

    //Palindrome Checker
    //Write a function to check if a given string is a palindrome.
    def num(x: String): Boolean = {
      (x.reverse) == x

    }

    println(num("madam"))
    println(num(" madam"))
    //List Reversal
    //Implement a function to reverse a list without using built-in functions like reverse.

    val empty: List[Any] = List()

    def func(list1: List[Int]): List[Any] = {
      val x = list1.foldLeft(empty)((acc, x) => x :: acc)
      x
    }

    println(func(List(1, 2, 3, 4, 5)))

    // Write a function that takes a string and returns a map with the count of each word.
    //  def funct(name : String) : Map[String,Int] = {
    //    name.split(" ") // Split by whitespace
    //        .map(_.replaceAll("[^a-zA-Z0-9]", "").toLowerCase) // Remove punctuation & lowercase
    //        .filter(_.nonEmpty) // Remove empty words
    //        .groupBy(identity) // Group by word
    //        .view.mapValues(_.length).toMap // Count occurrences
    //    }


    def wordCount(str: String): Map[String, Int] = {
      str.split(" ") // Split by whitespace
        .map(_.replaceAll("[^a-zA-Z0-9]", "").toLowerCase)
        .filter(_.nonEmpty)
        .groupBy(identity)
        .view.mapValues(_.length).toMap

    }

    println(wordCount("hello helo hello hei"))

    //Define a case class Person with name, age, and email.
    //Write a function to filter a list of persons by age and return their emails.
    case class person(name: String, age: Int, email: String)

    def filterpeople(persons: List[person], minage: Int): List[String] = {
      persons.filter(_.age <= 18).map(_.email)
    }

    val people = List(
      person("Alice", 25, "alice@example.com"),
      person("Bob", 17, "bob@example.com"),
      person("Charlie", 30, "charlie@example.com"),
      person("David", 15, "david@example.com")
    )
    val emails = filterpeople(people, 18)
    println(emails)

    //Implement a recursive and an iterative function to calculate the factorial of a given number.

    def number(num: Int): Int = {
      if (num == 1) 1
      else num * number(num - 1)
    }

    //println(number(5))

    val myList = List("a", "b", "c", "d", "e", "f", "g", "f")
    ///println(myList, 1, 2)
  
  
  }


