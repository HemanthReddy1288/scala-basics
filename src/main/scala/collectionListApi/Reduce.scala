package collectionListApi

object Reduce extends App{
  val number = List(2,4,3,6,8)

  val sum = number.reduce((x,y)=>(x-y))
  println(sum)
  val sum1 = number.reduce((x, y) => (x + y))
  println(sum1)
  val sum3 = number.reduce((x, y) => (x * y))
  println(sum3)
  val sum4 = number.reduceLeft((x, y) => (x - y))
  println(sum4)
  val sum5 = number.reduceRight((x, y) => (x + y))
  println(sum5)
}
