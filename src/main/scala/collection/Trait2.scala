package collection

class Trait2 extends fruit  with Type1 {
  override def getName()= println(" Apply,banana")
}

abstract class fruit {
  def getName() = { }
}
 trait Type1 {
   def getTypes() = { }

}
object  main2 {
  def main(args:Array[String]): Unit = {
    val obj = new Trait2
    obj.getName()
  }
}
