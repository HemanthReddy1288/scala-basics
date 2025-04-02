package collection

object List02 extends App{
  val twodlist=List(
    List(1,2,3),
    List(4,5,6),
    List(7,8,9)

  )
  println(twodlist)
  val abcde = twodlist.flatten
  println(abcde)
  val list3 = List(1,2,3,4,5,6,7,8,9)
  val list3_1 = list3.take(3)
  println(list3_1)
  val list3_2 = list3.takeRight(3)
  println(list3_2)
  val list3_3 = list3.takeWhile(_<5)
  println(list3_3)
  val list3_4 = list3.drop(4)
  println(list3_4)
  val list3_5 = list3.product
  println(list3_5)


}
