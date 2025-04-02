package inheritance

class Multiple {
  val name="hemanth"

}
trait Multiple2 {
  val age=21
}
class Multiple3 extends Multiple with Multiple2{
  val rollNo = 56
  def detail(): Unit = {
    println(s"name = $name")
    println(s"age  = $age")
    println(s"rollNo  = $rollNo")
  }


}
object mainns {
  def main(args:Array[String]): Unit = {
    val ob= new Multiple3
    ob.detail()

  }
}
