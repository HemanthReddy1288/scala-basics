package data.structures

import scala.collection.mutable.HashMap

object HashTables extends App{
  val hashTable = HashMap[String,Int]()

  hashTable += ("Abhi" -> 25)
  hashTable += ("Bob" -> 35)
  hashTable.put("Charlie", 25)
  println(hashTable)

  val abhiAge = hashTable.getOrElse("Abhi",-1)
  println(abhiAge)

  hashTable -= "bob"
  hashTable -= "Bob"

  println(hashTable)

  for ((key,value) <- hashTable){
    println(s"$key -> $value")
  }
}
