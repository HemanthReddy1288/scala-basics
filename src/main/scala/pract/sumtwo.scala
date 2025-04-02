//package pract
/////*Given an array of integers nums and an integer target
////, return indices of the two numbers such that they add up to target
////.
////
////You may assume that each input would have exactly one solution
////, and you may not use the same element twice.
////
////  You can
////return the answer in any order.
////
////Example 1:
////
//
//Input: nums = [2,7,11,15], target = 9
///Output: [0,1]
////Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
////
////*/
////object sumtwo extends App{
////  val nums= Array(2,7,11,15)
////  val target = 9
////
////  
////  for (x<- nums.indices){
////    val total= target - nums(x)
////    if (nums.contains(total))
////      print(nums(x),nums.indexOf(total))
////
////  }
////
////}
//case class Person(name: String, age: Int, email: String)
//
//// Function to filter persons by age and return emails
//def filterEmailsByAge(persons: List[Person], minAge: Int): List[String] = {
//  persons.filter(_.age >= minAge).map(_.email)
//}
//
//// Example usage
//val people = List(
//  Person("Alice", 25, "alice@example.com"),
//  Person("Bob", 17, "bob@example.com"),
//  Person("Charlie", 30, "charlie@example.com"),
//  Person("David", 15, "david@example.com")
//)
//
//val emails = filterEmailsByAge(people, 18)
////println(emails) // Output: List("alice@example.com", "charlie@example.com")
//
//
//
//
//
//
//
//
//
//
