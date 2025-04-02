object anagram extends App{
//  def groupAnagrams(words: List[String]): List[List[String]] = {
//    words.groupBy(_.sorted).values.toList
//  }
//
//  // Example Usage
//  val words = List("eat", "tea", "tan", "ate", "nat", "bat")
//  println(groupAnagrams(words))
  def groupAnagram(words : List[String]) : List[List[String]] = {
    words.groupBy(_.sorted).values.toList
  }
println(groupAnagram(List("eat", "tea", "tan", "ate", "nat", "bat")))
}
