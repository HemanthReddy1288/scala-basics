package thiskeyword

class Thiskey {
  var Lname:String = ""
  var Articles :Int= 0
  def this(Lname:String,Articles:Int) = {
    this()
    this.Lname = Lname
    this.Articles = Articles


  }
  def show (): Unit = {
    println("language name  "+ Lname+" published article "+Articles)

  }

}
object mainss {
  def main(args:Array[String]): Unit = {
    val obj=new Thiskey("scala",105)
    obj.show()
  }
}
