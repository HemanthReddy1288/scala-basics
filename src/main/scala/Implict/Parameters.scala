package Implict
 import scala.language.implicitConversions
object Parameters extends App{
  implicit val givenDiscount : Double = 0.1

  def calculateprice(amount : Double)(implicit discount : Double) : Double = {
    amount - (amount * discount)
  }
  println(calculateprice(200))
}
