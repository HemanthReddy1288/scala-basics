package D

//import task01.CheckerField
//
//
//object AbCs extends  App{
//  val list = List(1,2,3,4,5,6,7,7,7)
//  val list2 = list.toSet
// // println(list2)
//  val list3 = List(("a","b"),("f","y"))
//
//
//  val list4 = list3.toMap
// // println(list4)
//  val data = List(
//    CheckerField("name", "vishal"),
//    CheckerField("id", "1012"),
//    CheckerField("bankCode", "SPG"),
//    CheckerField("name", "hemanth"),
//    CheckerField("idType", "Student"),
//    CheckerField("bankCode", "HYU"),
//    CheckerField("lastName", "Singh"),
//    CheckerField("middleName", "Kumar"),
//    CheckerField("lastName", "random")
//  )
// val x = "name"
//
//  def helper(checking: List[CheckerRecsion], acc: List[CheckerRecsion]): List[CheckerRecsion] = {
//    if (checking.isEmpty) acc
//    else {
//    }
//  }


// val xy = data.foldLeft((List[(String,String)]()){(acc,x) => acc += x})
// println(xy)


//  val xy = data.groupBy(c => c._1).toList
//  val callHead = xy.map((a,b) =>b.head )
//  println(xy)
//
//  println(callHead)
//
//}



//case class list2(List1 : List[Int])

//object  hello extends App {
//  def helper(list: List[Int]) : Int = {
//    val acc: Int = Integer.MAX_VALUE
//    list.foldLeft(acc)((acc,x) =>
//      if(acc < x) acc
//      else x )
//  }
//
//  def helper2(list2: List[Int]): Int = {
//    val acc2: Int = Integer.MIN_VALUE
//    list2.foldLeft(acc2)((acc, x) =>
//      if (acc > x) acc
//      else x)
//  }
//
//  def mainmethod(list3: List[List[Int]]): Int = {
//    val check1 = list3.map(c => helper(c))
//    val check2 = helper2(check1)
//    check2
//  }
//
//  println(mainmethod(List(List(1, 20), List(4, 6), List(8, 9))))
//




//}

object hellos extends App{
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val cx= numbers.filter(_%2==0)
  println(cx)

  val reverseing = "Scala"
  val r = reverseing.reverse
  println(r)

  def fun(n : Int) : Int ={
    if(n == 0) 1
    else n * fun(n-1)
  }
  println(fun(5))

  def fun2(n : Int) : Int ={
    def helper(n: Int,a : Int,b: Int) : Int = {
      if(n == 0) a
      else {
        helper(n - 1, b, a + b)
      }
    }
    helper(n,0,1)
  }
  println(fun2(7))

  val name = "hello"
  val x1 = name.groupBy(identity).mapValues(_.length).toMap
  //x1.map((a,b) => a)
  println(x1)

  def fun2(lst : List[Int]) : Int = {
    lst.foldLeft(lst.head)((acc,x) =>
    if(acc > x) acc
    else x
    )
  }
  println(fun2(List(1,8,3,4)))


  val x3 = List(1, 3, 5)
  val x4 = List(2, 4, 6)
  val x5 = (x3 ::: x4).sorted
  println(x5)

  val x6 =List(10, 20, 4, 45, 99)
  val x7 = (x6.sorted).reverse
  val x8 = (x7.tail).max
  println(x8)

  val listLength = List(1, 2, 3, 4)

  val x = listLength.foldLeft(0){(count,_) => count + 1 }
  println(x)
  val x2 = List(2, 4, 6, 8)
  val x33 = x2.last
  println(x33)

  val x44 = (List(List(1, 2), List(3, List(4, 5))))
  //val x55 = x4.flatten

  val rotateLeft = List(1, 2, 3, 4, 5)
  val x555 = 2
  val (lift) = rotateLeft.splitAt(x555)
  //val yz = rigth ++ lift
  println(lift)

  val a2 = List(1, 2, 3, 4, 5)
  val a3 = 6
  val a4 = a2.combinations(2).toList
  val a5 = a4.filter(_.sum == 6)
  println(a5)

  val b = List("Scala", "is", "awesome").mkString("'",":","")
  println(b)

  val b2 = List("Scala", "is", "awesome").mkString("-")
  println(b2)

  def leapyear(x: Int) : Boolean={
    x % 4 == 0 && x%400 != 0
  }
  println(leapyear(2012))

  def reverseInt(n: Int, rev: Int = 0): Int = {
    if (n == 0) rev
    else reverseInt(n/10, rev * 10 + n % 10 )
  }

  println(reverseInt(1234))

  def fibonacciList(x: Int): Unit = {
    def helper(x: Int, a: Int, b: Int): Int = {
      x.match {
        case 0 => a
        case _ => helper(x - 1, b, a + b)
      }
    }
  }
  println(fibonacciList(5))
  //isUnique("hello") // Output: false
  //isUnique("world") // Output: true
  val v = "hello"
  val v2 = v.groupBy(identity).exists(_._2.length==1)
  println(v2)

  val result = List(1, 2, 3).flatMap(x => List("A", "B").flatMap(y => List("a","b").map(z =>s"$x$y$z")))

  //println(result)

  val result2 = for{
    l1 <- List(1,2,3)
    l2 <- List("A", "B")
    l3 <- List("a","b")
  }yield(s"$l1$l2$l3")

  println(result2)

  val xyz = for{
    a <- List(1,32,3,4)
    b <- List(2,3,4,6)
  }yield(a + b)
  println(xyz)

  val qa11 = List(List(1,2,3),List("a","b","c"))



}






  //val abcz = List(List(1,20),List(4,6),List(8,9))
