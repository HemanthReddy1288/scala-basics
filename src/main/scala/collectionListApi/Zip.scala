package collectionListApi

object Zip extends App{
  val list1 = List(1,2,3,4,5)
  val list2=List("a","b","c","d")
  val x = list1.zip(list2)
  println(x)

  val list3=List((1,"a"), (2,"b"), (3,"c"), (4,"d"))
  val (y,z)=list3.unzip
  println(y)
  println(z)
}
