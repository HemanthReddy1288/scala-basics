package inheritance

class Multilevel {
  val name = "hemanth"
}
class child extends Multilevel{
  val age = 21

}
class child22 extends child{

  def details(): Unit = {
    println("name is :"+name)
    println("name is :"+ age)

  }
}
object mains {
  def main (agrs:Array[String]):Unit= {
    val ob = new child22
    ob.details()
  }
}