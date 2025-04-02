package Recursion

object   Recursionss extends App{
  def function(x:Int):Int={
    if (x==1) 1
    else x*function(x-1)
    }
  println(function(4))
}

