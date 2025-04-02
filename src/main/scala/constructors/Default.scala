package constructors

class Default {
  def display():Unit={
    println("Welcome to Geeksforgeeks")
  }
}
object main {
  def main (args:Array[String]): Unit = {
    val obj= new Default()
    obj.display()
  }
}