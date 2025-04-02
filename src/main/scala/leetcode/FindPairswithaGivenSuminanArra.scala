package leetcode

object FindPairswithaGivenSuminanArra extends App{
  def number(nums:List[Int],target: Int): Unit = {
    val res = nums.combinations(2).toList
      .filter(_.sum == target).map(a => (a(0), a(1)))
    println(res)


  }
  number(List(1,2,3,4,5,6),6)

}
