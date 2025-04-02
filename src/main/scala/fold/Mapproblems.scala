package fold

object  Mapproblems extends App {
  val words = List("apple", "banana", "apple", "orange", "banana", "apple")
  val x = Map(("a",1),("b",100))
  val y = (("a",1),("b",100))
  println(y._1._1)
  
}
