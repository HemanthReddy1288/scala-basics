package task.of25

// Write a Scala program to convert the last 4 characters of a given
// string in upper case. If the length of the string has less than 
// 4 then uppercase all the characters.


object LowerCaseToUpperCase extends App{
  def name(x: String) : String ={
    val xLength = x.length
    if(xLength < 4) {
      x.toUpperCase
    } else{
      val a1 = x.substring(0,xLength-4)
      val a2 = x.substring(xLength-4,xLength).toUpperCase()
      a1 + a2
    }
  }
  println(name("hemanth"))
  }



