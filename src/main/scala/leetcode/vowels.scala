package leetcode

object vowels extends App{
  def names(name: String): Int = {
    name.count("aeiouAEIOU".contains(_))
    //val x = List("vishal","ravi","hemanth") 

  }
  println(names("hemanthaeiuoAeiou"))
}
