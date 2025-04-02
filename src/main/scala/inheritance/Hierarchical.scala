package inheritance

class Hierarchical {
  val name1 ="hello"
  val name2 = "world"
}
class child1 extends Hierarchical{
  val age = 21
  def details(): Unit = {
    println("name is :"+ name1)
    println("age is :" + age)
  }
}

class child2 extends Hierarchical{
  val heigth = 6.3

  def details2(): Unit = {
    println("name is :"+name2)
    println("heigth is :"+ heigth)
  }
}
object main {
  def main(args:Array[String]): Unit = {
    val obj1=new child1()
    val obj2 = new child2()
    obj1.details()
    obj2.details2()
  }
}