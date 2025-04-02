package curring

object StringManipulation extends App{
  def geeks(a: String)( b: String): String = s"$a,$b"
  val sayHello = geeks("hello")
  println(sayHello("world"))
  println(sayHello("++++++"))


}
