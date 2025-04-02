package controlStatement

object ForYield extends App{
  val list1 = List(1,45,76,89,32,1245)
  val res = for ( i <- list1  if i%2==0 && i != 32) yield i
  println(res)

}
