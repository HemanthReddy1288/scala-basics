package Recursion

object MethodOverload2 extends App{
  def fun(name:String,no:Int): Unit = {
    println("Name of the watch company is:" + name);
    println("Total number of watch :" + no);

  }

  def fun(no: Int, name: String):Unit= {
    println("Name of the watch company is:" + name);
    println("Total number of watch :" + no);
  }
  fun ("hello",25)
  fun (88,"hello")
}
