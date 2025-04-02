package leetcode

object palindrome extends App{
  def names(name:String):Boolean = {
    val res = name.reverse
    res == name


  }
  println(names("madam"))
  println(names("madam "))
}
