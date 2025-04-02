package higher.order.function

object HodCollection extends App{
  val list = List(1,2,3,4,5,6,67,87)
  // chaining Higher-order-function
  // Higher-order-function
  val number= list.map(x => x * x)
    .filter(_%2==0)
    .reduce(_ + _)
  println(list)

}
