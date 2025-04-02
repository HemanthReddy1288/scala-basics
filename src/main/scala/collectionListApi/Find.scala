package collectionListApi

object Find extends App{
   val number = List(1,2,34,5)
   val result = number.find(_%2==0)
   println(result)
}
