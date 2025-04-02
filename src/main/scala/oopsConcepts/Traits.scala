package oopsConcepts
import scala.math

trait Traits{
  def area:Double
  def description:String="I am a shape"
}
class Circle(radius: Double) extends Traits {
  override def area:Double=math.Pi*radius*radius

}
object mainnnn {
  def main(args: Array[String]): Unit = {
    val circle = new Circle(5)
    
    println(circle.area)

  }
}