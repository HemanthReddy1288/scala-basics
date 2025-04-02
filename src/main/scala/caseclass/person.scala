package caseclass
case class Person(name: String, age: Int) {

}
object mainnn {
  def main(args: Array[String]): Unit = {
    val person1 = Person("Alice", 25)
    val person2 = Person("bob", 30)
    println(person1)
    println(person2 == person1)
    val person3 = person1.copy(age = 26)
    println(person3)
    println(person1)
  }
  def pattern(person : Person) : String = {
    person match {
      case Person("Alice", _ ) => s"hello Alice"
      case Person( _, age) if age < 18 => " you're underAge"
      case Person( name,age) => s"hi $name is age is $age"
    }
  }
  println(pattern(Person("Alice",44)))
}
