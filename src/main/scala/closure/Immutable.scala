package closure

object Immutable extends App{
  val greeting = "hello"
  val sayHello = (name: String) => s"$greeting,$name!"
  println(sayHello("------!"))
  println(sayHello("++++++"))
}
