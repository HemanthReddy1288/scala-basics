package collection

object Sets extends App{
  var set1 = Set(1,2,3,4,5)
  set1 += 45
  set1 -= 5
  println(set1)
  var set2 = Set(5,6,7,8,9)
  set2 += 0
  set2 -= 9

  val set3 = Set(1,2,3,4,5,6)
  val sq = Seq(1,2,3,4,5,6,8,9,0)
  val li = List(1,2,4,78,56,34)
  val add =  set1 ++ set2
  println(add)
  val add2 = set3 ++ li
  println(add2)
  val add3 = set1 ++ List(100,200,300,400)
  println(add3)
  println(add3.max)
  println(add3.min)
  println(add3.sum)


}
