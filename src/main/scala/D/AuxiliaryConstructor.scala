package D


class AuxiliaryConstructor(Aname:String, Cname:String) {
  var no=0
  def display(): Unit = {
    println("Author name:"+ Aname)
    println("Chapter name:"+ Cname)
    println("Toatal number of Articals:" + no)
  }
  def this(Aname:String,Cname:String,no:Int)= {
    this(Aname,Cname)
    this.no=no
  }
}
object Mainss {
  def main(args:Array[String]): Unit = {
    val obj= new AuxiliaryConstructor("anya","constructor",34)
    obj.display()
  }
}
