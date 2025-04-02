package either

object BasciExample extends App{
  def divided(x: Int, y : Int) : Either[String,Int]={
    if(y == 0) Left("Cannot divided with zero")
    else Right(x/y)
  }
  println(divided(20,10))
  println(divided(20,0))

  val divid: Either[String, Int] = divided(10, 0)
    divid match {
      case Left(error) => println(s"Cannot divided with zero")
      case Right(value) => println(value)
    }
  val result = divided(10, 2).map(_ * 2)
  println(result)

}
