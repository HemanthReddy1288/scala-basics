package function

object Func2 extends App{
  def sum(a: Int, b: Int = 4) = { println(a + b)}
  sum(56, 76)
  def div(c: Int, d: Int) = { println(c/d)}
  div(3,9)


  def func3(x:Int): Unit = {
    def num(x: Int): Unit = {
      if(x % 2 == 0)
        {println("Even")}
        else{
          println("Odd")
        }
    }
    num(x)

  }
  func3(10)
}
