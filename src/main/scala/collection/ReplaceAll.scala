package collection

object ReplaceAll extends App{
  val list1 =" hello, world! 123."
  val list2 = list1.replaceAll("[^a-zA_Z0-9]","")
  println(list2)

  //Replace Multiple Spaces with One Space
  val str = "  this  is  sentences  with  extra  square"
  val str2 = str.replaceAll("  "," ")
  println(str2)

  val num = "abc12345fg567"
  val num2 = num.replaceAll("[0-9]","")
  println(num2)

  // Replace Newlines with a Space
  val str3 ="This is line 1.\nThis is line 2."
  val str4 = str3.replaceAll("\n"," ")
  println(str4)

  // Case-Insensitive Replacement
  val str5 = "I have a Cat, a CAT, and a cAt."
  val Str6 = str5.replaceAll("(?i)cat", "dog")
  println(Str6)


}
