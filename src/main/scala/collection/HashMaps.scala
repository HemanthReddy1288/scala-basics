package collection
import scala.collection.mutable.HashMap

object HashMaps extends App{
   var hashmap = HashMap("c"->"c++","s"->"scala","j"->"java")
   hashmap.foreach{
     case (key,value)=>println(key +"->"+value)
   }
   println("___________")

   var hs2= hashmap -=  "c"
   hs2.foreach{
     case(key,value)=>println(key + "->" + value)
   }
   println(hs2)

}
