package collectionListApi

object Filter extends App{
  val number = List(2,4,5,6,88,45,8)
  val fil = number.filter(num => num == 8).head
  val xy = number.indexOf(fil)
  println(xy)
  println(fil)
//  println(number.filter(_%2==0))
//  println(number.filter(_%2!=0))
//  println(number.filter(_==88))
//  println(number.filter(_!=88))
  val number2 = List(2,4,5,6,88,45,8)


}
