package oopsConcepts

abstract class myauthor {
  def details(): Unit = {

  }

}
class result extends myauthor{
   override def details(): Unit = {
     println(s"Author name: xyz")

   }
}


object main {
  def main(args: Array[String]): Unit = {
    val ob = new result
    ob.details()

  }

}