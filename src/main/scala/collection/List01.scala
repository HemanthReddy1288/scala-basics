package collection

object List01 extends App{
  val mylist1=List("frist","second","third")
  val mylist2=List("c","c++","java","Scala")
  println("mylist1 :")
  println(mylist1)
  println("\nList2:")
  for (mylist<-mylist2){
    println(mylist)
  }
  println(mylist1.init)
}
