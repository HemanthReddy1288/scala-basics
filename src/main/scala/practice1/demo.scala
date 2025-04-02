package practice1

object  ControlStructures extends App{
  val x  = "hello scala"
  println(x)


  def num(y : Int) : Boolean={
    y %2 == 0
  }
  println(num(66))

  val list = List(23,65,78,9)
  println(list.max)


  val xy = for( i <- 1 to 100 if i%3==0)
      {
        println(i)
      }

  // Functions & Recursion
  def fact(a : Int ) : Int = {
    if (a == 1 ) 1
    else(a * fact(a - 1))
  }
  println(fact(12))

  def nums(prime: Int ) : Unit={
    if (prime < 2 && prime%2 != 0  ) println("it prime number")
    else println("its a non prime")
  }
  nums(66)

  val prime = for(i <- 1 to 300 if (i % 2 != 0 )) {
    println(i)
  }

  def sum( num: List[Int]) : Int = {
    num.sum
  }
  println(sum(List(23,54,7,9,87)))

  //Collections & Higher-Order Functions
  val lists = List(1,2,3,4,5,6,7,8,9,0)
  val res = lists.filter(_%2==0)
  println(res)
  val res22 = lists.map(c => c*c)
  println(res22)


  val x1 = "hello World"
  val x2 = x1.toUpperCase
  println(x2)


  //Pattern Matching & Case Classes
  def days( day: String) : String = {
    val lowercase = day.toLowerCase
    lowercase match {
      case "sunday"| "saturday"  => "weekend"
      case "monday"| " tuesday" | "wednesday" | "thursday"  => "weekday"
      case "_" => "error"

    }
  }
  println(days("sunday"))

  def numbe(xyz :Option[Int]): String = {
    xyz match {
      case Some(value) => s"$value"
      case None => "undefind"
    }

  }
  println(numbe(None))

  def rectarngle(length: Int ,width : Int): Int = {
    length*width
  }
  println(rectarngle(20,15))

}
abstract class shape {
  def area : Double

}
class circle(radius : Double) extends shape {
  def area = math.Pi * radius *radius

}
class rectangle(length: Int, width : Int) extends shape {
  def area = length * width
}
object main {
  def main(args:Array[String]): Unit= {
    val obj = new circle(5.0)
    val obj2 = new rectangle(3,5)
    println(obj.area)
    //println(obj25.area)



  }
}