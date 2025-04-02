package inheritance

class Name2 {
  val name="hemanth"
}
class Age extends Name2{
  val age=21

  def details(): Unit = {
    println("name is :"+ name)
    println("age is :" + age)

  }
}
object mainss {
  def main(agrs:Array[String]):Unit={
    val ob=new Age
    ob.details()
  }
}
