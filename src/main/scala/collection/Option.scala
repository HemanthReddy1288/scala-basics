package collection

object Option extends App{
  val name= Map("a"->"author","c"->"coder")
  val x=name.get("a")
  val y=name.get("b")
  val z=name.get("c")
  println(x)
  println(y)
  println(z)
  println(name.get("x").getOrElse("0"))
  println(name.isEmpty)

}
