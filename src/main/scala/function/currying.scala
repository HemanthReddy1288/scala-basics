package function

object currying extends App{
  def add(x: Int, y: Int) = x + y
  def add2(x: Int) = {
    (y: Int) => x + y
  }
  def add3(x: Int)(y: Int) = x + y
  val add444 = add3(2)
  println(add(20,30))
  println(add2(300))
  println("+++++++++")
  println(add444(222))

  def add4(x: Int) = (y: Int) => x + y
  def add5(x: Int)(y: Int) = x + y
  val add30 = add4(30)
 // println(add30(20))
  val add500 = add5(678)_
  val curied = add500(12)
  println(curied)

  def curiedFunc(x: Int)(y: Double)(z: String):Unit = {
    val m = x.toDouble
    val add = m+y
    println(add)
  }
  val curriedSeq = curiedFunc(20)_
  println(curriedSeq)
  val curiedSeq2 = curriedSeq(40)
  val curiedSeq3 = curiedSeq2(" hello")
  println(curiedSeq3)




}
