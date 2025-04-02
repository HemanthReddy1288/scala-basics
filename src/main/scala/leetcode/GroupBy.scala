package leetcode

object NonRepeatingCharacter extends App{
  def words(s: String): Char= {
    s.find(c => s.count(_ == c)==1).getOrElse('_')


  }
  println(words("swiwsiu"))

}
