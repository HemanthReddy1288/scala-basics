package collection
import scala.collection.mutable.Map

object Mapss extends App{
  val mymap =Map("Ajay" -> 30, "bhavesh" -> 20, "charlie" -> 50)
   val ajay=mymap("Ajay")
   mymap("hemanth") = 10
  println(ajay)
  println(mymap)

  //val mutable: Nothing = null
  val mymap2 = Map("Ajay" -> 30, "bhavesh" -> 20, "charlie" -> 50)
  mymap2("Ajay") = 10
  println(mymap2)

  //Adding new key-value pair
  val mymap3 = Map("Ajay" -> 30, "bhavesh" -> 20, "charlie" -> 50)
  mymap3 ++= Map("Ajay" -> 10, "Dinesh" -> 60)
  mymap3("hemanth") = 35
  mymap3 -= "hemanth"
  println("addingToMap:"+mymap3)

  //Deleting a key-value pair:
  mymap3 -= ("charlie")
  println(mymap3)
  val x:Option[Int] = Some(12345)
    val y = x.getOrElse(2)
    println(y)
  val banana = util.Try(mymap3("Ajay")).getOrElse("none")
  println(banana)
  val abc = mymap3.get("bhavesh")
  println(abc)
  mymap3.drop(1)
//  mymap3.drop(2)
//  mymap3.drop((1))
  println(mymap3)
 // mymap3 += ("Ajay" -> 30, "bhavesh" -> 20, "charlie" -> 50)
//  mymap3.foreach{f => println(f)}





}
