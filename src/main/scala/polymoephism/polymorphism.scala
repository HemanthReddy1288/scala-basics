package polymoephism

class polymorphism {
  def method(a:Int): Unit = {
    println("First Execution:" + a)
  }
  def method(a:Int,b:Int): Unit = {
    val sum=a+b
    println("second Execution:"+ sum )
  }
  def method(a:Int,b:Int,c:Int): Unit = {
    val sum=a+b+c
    println("third Execution:" + sum)

  }
}
object mainsssss {
  def main(args:Array[String]): Unit = {
    val obj=new polymorphism
    obj.method(4,5,6)
    obj.method(3)
    obj.method(7,9)
  }
}
