package thiskeyword

class addition(i:Int){
  def this(i:Int,j:Int) = {
    this(i)
    println(i+"+"+j+"="+(i+j))
  }
}
object main {
  def main(args:Array[String]): Unit = {
    val add=new addition(2,5)
  }
}

