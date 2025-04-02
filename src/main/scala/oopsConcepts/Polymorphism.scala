package oopsConcepts

class PolymorphismOverrider {
  def area()=0.0

}
class cricle(radius:Double) extends PolymorphismOverrider{
  override def area():Double=math.Pi*radius*radius

}
class rectangle(length:Double,width:Double) extends PolymorphismOverrider{
  override def area(): Double = length*width
}
object mainMethod {
  def main(args:Array[String]): Unit = {
    val ob = new cricle(8)
    val ob2 = new rectangle(23,45)
    println(ob.area())
    println(ob2.area())

  }
}