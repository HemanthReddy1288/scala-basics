package collection

class Tuplesss  extends  Domestics with Wild with WaterAnimal {
  def getName() = println("cow is domestic animal")

  override def getFoodType() = println(" cow eats grass")

  override def getWildAnimal() = println(" Shark is the water animal")

}
 trait Domestics {
   // abstract
   def getname() = { }
   // non abstract
   def getFoodType() = println("cow eats grass")


 }
 trait Wild {
   def getWildAnimal() = { }
 }
 trait  WaterAnimal()  {
  def getwaterAnimal = println(" water animal")
}

object  mainmain {
  def main (Args:Array[String]): Unit = {
    val obj = new Tuplesss
    obj.getName()
    obj.getFoodType()
    obj.getWildAnimal()
  }
}

