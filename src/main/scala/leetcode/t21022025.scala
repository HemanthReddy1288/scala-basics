package leetcode

object t21022025 extends App{
  def matenpatten(x : Int , a : Char, y : Int): Int = {
    a match{
      case '+' => x + y
      case '-' => x - y
      case '*' => x * y
      case '%' => x % y
    }
  }
  println(matenpatten(5 ,'*',6))
    //Write a function to check if a number is even or odd
  def funct(x : Int) : Unit = {
    if(x%2==0){
      println("even")
    }else{
      println("odd")
    }
  }
  funct(66)

  //Write a function that takes a string and returns its length
  def fun(x: String) : Int ={
    x.length
  }
  println(fun("hmanth"))

    
}
