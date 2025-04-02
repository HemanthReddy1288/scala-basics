package patten.matching
object traitsExamples extends App{

  sealed trait Animal
case class Dog(name: String) extends Animal
case class Cat(name: String) extends Animal

def describeAnimal(animal: Animal): String = animal match{
  case Dog(name) => s"A Dog name $name"
  case Cat(name) => s"A Cat name $name"
}

    println(describeAnimal(Dog("kuka")))
    println(describeAnimal(Cat("peli")))


}


