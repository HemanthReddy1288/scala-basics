package collection
import  scala.collection.immutable.HashSet

object Hashset extends App{
   val hashset =HashSet("abc","def","ghi","jkl")
   println(hashset)

   println(s"ELement abc=${hashset("abc")}")
   println(s"ELement efg=${hashset("efg")}")

   val hs2 = hashset + "mno"
   println(hs2)

   val hs3 = hs2 ++ HashSet("java","scala")
   println(hs3)

   val hs4 =hs3 - "mno"
   println(hs4)

   println(hs2 & hs3)

   val hs5 = HashSet.empty
   println(hs5)
}
