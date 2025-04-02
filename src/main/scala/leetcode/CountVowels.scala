package leetcode

object CountVowels extends App{


  def countVowels (s: String): Int = {
    val vowels = "aeiouAEIOU"
    s.filter(c => vowels.contains(c)).length

  }
 println(countVowels("hemanth"))

 def name( n : String) : Int = {
   val con = "l"
   n.filter(c => con.contains(c)).length

 }
 println(name("hello"))


}