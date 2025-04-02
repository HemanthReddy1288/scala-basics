package polymoephism

class MethodOverrider {
  def area():Double=0.0
}
class Cricle(radius:Double) extends MethodOverrider{
  override def area():Double= math.Pi*radius*radius
}
class Rectangle(length:Double, width:Double) extends MethodOverrider{
  override def area():Double = length * width
}

object main {
  def main(args:Array[String]): Unit = {
    val Circle= new Cricle(4)
    val rectangle= new Rectangle(5,7)
    println({Circle.area()})
    println({rectangle.area()})
  }
}