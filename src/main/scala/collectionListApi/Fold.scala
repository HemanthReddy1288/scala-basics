package collectionListApi

object Fold extends App{
  val list1= List(2,4,6,4,2,3,1,7,8,6,5,9)
  val total = list1.fold(400)((x,y)=>x+y)
  println(total)
  val hello=List("b","c","d")
  val addition= hello.fold("a")((x,y)=>x+y)
  println(addition)
  val addlift=list1.foldLeft(4)((x,y)=>x+y)
  println(addlift)
  val addrigth = list1.foldRight(4)((x, y) => x + y)
  println(addrigth)
  val addsleft = hello.foldLeft("a")((x, y) => x + y)
  println(addsleft)
  val addsrigth = hello.foldRight("a")((x, y) => x + y)
  println(addsrigth)

}
