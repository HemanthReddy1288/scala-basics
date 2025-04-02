package collection

object Arrays extends App{
  var days = Array("Sunday", "Monday", "Tuesday",
    "Wednesday", "Thursday", "Friday","Saturday")
  for (day <- days){
    println(day)
  }
  println(days(5))

}
