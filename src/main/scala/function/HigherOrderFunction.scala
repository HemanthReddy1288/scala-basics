package function

object HigherOrderFunction extends App{
  def math(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double=f(f(x,y),z)
  println(math(50,20,10,(x,y)=>x + y))

  def math2( a: Int, b: Int,f:(Int, Int) => Int): Int = { f(a,b)}

  def add( x: Int, y : Int): Int = { x + y}

  val abc = math2(3,6,add)
  println(abc)



  

}
