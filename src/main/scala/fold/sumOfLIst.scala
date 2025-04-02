package fold

object foldproblems extends App{
  //Write a function using foldLeft to compute the sum of a list of integers
  def list1(a: List[Int]): Int =
    a.foldLeft(0)((x,y)=>(x+y))
    a.foldLeft(0)(_ + _)


  println(list1(List(1,2,3,4,5)) )

  //Compute the product of a list using foldLeft


  def list2 (b : List[Int]): Int =
    b.foldLeft(1)(_*_)

  println(list2(List(1,2,3,4,5)) )


  //Implement list reversal using foldLeft
  def list3 (b : List[Int]): List[Int] =
    b.foldLeft(List.empty)((acc , y)=>( y ::  acc))
  println(list3(List(1,2,3,4,5)))

  //Find the maximum element
  def list4 (c : List[Int]): Option[Int] = {
    c.reduceOption((a,b)=> if (a>b) a else b)
  }
  println(List(1,8,3,2,12,6).foldRight(Integer.MIN_VALUE){
    case (a,b)=> {
      println(s" the value of acc is $a and the value of next is $b")
      if a>b then a else b}
  })
  //Compute Factorial
  def list5(d: Int) : Int = (1 to d ).foldLeft(1)( _ * _ )
  println(list5(5))
  //Count Elements in a List
  private def list6(e: List[String]) : Map[String,Int] = {
    e.foldLeft(Map.empty[String,Int])((acc,x) => acc + ( x -> (acc.getOrElse(x,0) + 1)))

  }
  println(list6(List("a", "b", "a", "c", "b", "b")))


  //Flatten a List of Lists
  private def list7(lists : List[List[Int]] ): List[Int] = {
    lists.foldLeft(List.empty)(_ ::: _ )
  }
  println(list7(List(List(1, 2), List(3, 7), List(5))))


  //Check if a String is a Palindrome
  def list8(name : String) : Boolean = {
    name.foldLeft("")((acc,x) => x + acc) == name
  }
  println(list8("madam"))
  println(list8("hello"))
  println(list8("hellolleh"))
  //Join a list of strings with a separator.
  def List9(names : List[String],sep : String) : String = {
      names.foldLeft("")((acc,x)=> if(acc.isEmpty) x else acc + sep + x)

  }
  println(List9(List("Scala", "is", "fun"), " "))
  //Compute cumulative sum at each step
//  def list10(list : List[Int]) : List[Int] ={
//    list.foldLeft(List.empty,0){ case ((acc,sum),x) => (acc :+ (sum + x),sum + x) }._1
//
//


  def runningSum(xs: List[Int]): List[Int] =
    xs.foldLeft((List.empty[Int], 0)) { case ((acc, sum), x) =>
      (acc :+ (sum + x), sum + x)
    }._1

  println(runningSum(List(1, 2, 3, 4, 5)))


}




object Abc extends App {
  val anyList = List("a","b","c")

  def findValue(index: Int): String = {
    anyList.filter(c => anyList.indexOf(c) == index).mkString
  }
  println(findValue(1))
}

object abcd extends App {
  val arr = Array(1, 2, 3, 4)
  println(arr(2))

  val list = List(1, 2, 3, 4, 5)
  val arr2 = list.toArray
  println(arr2(0))
  println(list(1))
  val list33 = List("a", "b", "c", "d")
  println(list33(0))
  println(list33(2))


  def names(name: String): Boolean = {
    name.foldLeft("")((acc,x) => x + acc) == name
  }

  println(names("madam"))

}
