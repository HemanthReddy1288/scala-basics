package constructors

class PrimaryConstructor(authorName:String, chapterName:String, Particle:Int) {
  def details(): Unit = {
    println("Author Name is :"+ authorName)
    println("Chapter Name is :"+ chapterName)
    println("published artical is :" + Particle)
  }
}
object mains {
  def main (args:Array[String]): Unit = {
    val obj=new PrimaryConstructor("Ankita", "Constructors", 145)
    obj.details()
  }
}