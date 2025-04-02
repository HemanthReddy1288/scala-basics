package function

object Closures extends App{
  val number=10
  val add=(x:Int)=>{
    x+number
  }
  println(add(20))
}
