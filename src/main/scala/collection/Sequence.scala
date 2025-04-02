package collection

object Sequence extends App{
  val sq = Seq(1,2,3,4,5,6,7,8)
  sq.foreach(i => println(i))
  println(sq(1))
  def squared(x: Seq[Int]): Seq[Int] = { x.map( f => f * f )}
  val list = List(1,2,3,4,5)
  val ArrA = Array(2,3,6,8)
  val v = Vector(1,2,3,4,5,6)
  println(squared(list))
  println(squared(ArrA))
  println(squared(v))
  println(sq.count(c => c > 5))
  println(sq.contains(8))
  println(sq.isEmpty)
  println(sq.indexOf(3))
  println(sq.indexOf(8))


}
