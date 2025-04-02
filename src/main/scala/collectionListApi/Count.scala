package collectionListApi

object Count extends App{
  val number =List(1,2,3,4,5,2,3,2,4,2,42,2,2,3)
  val total = number.count(_==2)
  println(total)


}
