package function

object Anonymous extends App{
  
  var result = (x: Int, y: Int) => (x + y)
  println(result(111, 222))
  var result2 = (_: Int) + (_: Int)
  println(result2(222, 333))
}
