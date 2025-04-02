package collection
import  Array._
object AddingArray extends App{
  var name = new Array[String](4)
  name(0)="c"
  name(1)="c++"
  name(2)="java"
  name(3)="scala"
  for (x<- name){
    println(x)
  }
}

object main extends App{
  var arr1 = Array(1, 2, 3, 4)
  var arr2 = Array(5, 6, 7, 8)
   var arr3 =concat(arr1,arr2)
   for (y <- arr3){
     println(y)
   }

}
