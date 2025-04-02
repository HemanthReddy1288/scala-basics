package collection

object Map22 extends App{
  val mymap = Map("Ajay" -> 30, "bhavesh" -> 20, "charlie" -> 50)

  for ((k,v ) <-  mymap){
    print("Key :"+k +" ,")
    println(" Value :" + v)

  }
  val x = List("1","2","3","4")
  val y = x.reverse
}
