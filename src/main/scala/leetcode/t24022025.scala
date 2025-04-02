package leetcode

object t24022025 extends App{
  def countVowel(x : String): Int = {
    val vowels = Set('a','e','i','o','u')
    x.count(vowels.contains)
  }
  println(countVowel("ahello"))


  def maxnumber(num : List[Int]) : Option[Int] ={
    if (num.isEmpty) None
    else Some(num.reduceLeft((x,y)=> if(x > y) x else y))
  }
  println(maxnumber(List(2,3,4,5,6,9)))

  def removeDuplicates(lst: List[Int]): List[Int] ={
    lst.distinct
  }
  println(removeDuplicates(List(1,2,3,4,5,6,77,6,5,3,3,34,2,19)))

  def rotateLeft(lis: List[Int],n:Int) : List[Int] ={
    if(lis.isEmpty) lis
    else{
      val shift = n % lis.length
      lis.drop(shift) ++ lis.take(shift)
    }
  }
  println(rotateLeft(List(1,2,3,4,5,6),4))

  def groupPairs(lst: List[Int]): List[(Int, Int)] = {
    //lst.groupBy(identity)
    lst.grouped(2).collect{ case List(a,b) => (a,b)}.toList
  }
  println(groupPairs(List(1,2,2,3,33,3,4,4,4,4,55,55)))

  //Given a sentence, find the longest word.
  def words(sentence : String) : String ={
    sentence.split(" ").maxByOption(_.length).getOrElse(" ")
  }
  println(words("the hello world"))

  //Implement run-length encoding for a list
  def runLength(lst : List[Int]) : List[Any] ={
    lst match {
      case Nil => Nil
      case _ => lst.groupBy(identity).toList.map{ case (x,y) => ( x,y.length) }
    }
  }
  println(runLength(List(1,22,33,444,55,6,55,33,22,1)))

  //Write a function that returns the last element of a list

  def lastElement(lst: List[Int]): Int = {
    lst.last
  }
  println(lastElement(List(1,2,3,4,5)))

  //Check if a List is Sorted
  def number(lst : List[Int]) : Boolean ={
     val reverse = lst.reverse
    lst == reverse
  }
  println(number(List(1,2,5,4,3)))

  //Write a function to find the greatest common divisor of two numbers
  def numbers( x: Int, y: Int) : Int = {
    if(y == 0) x.abs
    else{
      x % y
    }
  }
  println(numbers(48,18))

  //Implement a function that reverses a list manually.
  def rev(x :List[Int]) : List[Int] = {
    x.foldLeft(List.empty[Int])((acc,b) => (b :: acc) )

  }
  //Implement a function that checks if a given element is present in a list
  def fun(x: String,y : String) : Boolean ={
    x.contains(y)
  }
  println(fun("hello","h"))

  //Find the Nth Fibonacci Number
  def fibonacci( n : Int) : Int ={
    if (n == 1) 1
    else(n * fibonacci(n -1))
  }
  println(fibonacci(5))
  //Given a list and an integer n, remove every nth element from the list
  def fun2(x : List[Int],y : Int) : List[Int] = {
    if(x.isEmpty) x
    else{ x.drop(y)}
  }
  println(fun2(List(1,2,3,4,5),3))

  def fun3(x : List[Int],y : Int) : List[Int] = {
    x.filter(c => c !=  y)
  }
  println(fun3(List(1,2,3,4,5),3))

  //Write a function that returns the common elements between two lists.
  def fun4(x : List[Int],y:List[Int]): List[Int] = {
    x.intersect(y)
  }
  println(fun4(List(1,2,3,4,5,6),List(3,4,5,67,8,9)))

  //Given two strings, check if they are anagrams.
  def anagram(a : String , b : String) : Boolean = {
    a.sorted == b.sorted
  }
  println(anagram("listen","silent"))

  //Write a function that returns the second smallest element in a list.
  def fun5(x : List[Int]): Int ={
    val abc = x.sorted
    val cde = abc.tail.min  
    cde

  }
  println(fun5(List(4,6,2,4,7,9,6)))



}



