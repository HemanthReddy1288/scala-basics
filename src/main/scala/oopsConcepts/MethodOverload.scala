package oopsConcepts

class MethodOverload {
  def add(a: Int): Unit = {
    println(s"a value = $a")
  }
  def add (a:Int,b:Int): Unit = {
    val sum = a + b
    println(s"sum value = $sum")
  }
  def add (a:String, b:Int): Unit = {
    val sum = a + b
    println(s"sum value = $sum")
  }
  def add (c:String,a:Int,b:String): Unit = {
    val sum = c+ a + b
    println(s"sum value = $sum")
  }
}
object maino {
  def main (args:Array[String]): Unit = {
    val ob= new MethodOverload
    ob.add(1)
    ob.add(23,54)
    ob.add("hello ",45)
    ob.add("number ", 1, " is hear")

  }

}

