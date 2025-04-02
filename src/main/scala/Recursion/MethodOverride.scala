package Recursion

class MethodOverride {
  def numberofStudent(): Unit = {

  }

}
class class1 extends MethodOverride{
  override def numberofStudent():Unit={
    9
  }
}
class class2 extends class1{
  override def numberofStudent(): Unit = {
    32
  }
}

class class3 extends class2 {
  override def numberofStudent(): Unit = {
    39
  }
}
object main {
  def main(args:Array[String]): Unit = {
    var x=new class1()
    var y=new class2()
    var z=new class3()
    println(x.numberofStudent())
    println(y.numberofStudent())
    println(z.numberofStudent())
  }
}