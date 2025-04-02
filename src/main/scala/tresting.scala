object tresting extends App{
  object PascalsTriangle {
    def generate(rows: Int): List[List[Int]] = {
      (0 until rows).map { row =>
        (0 to row).map(col => binomial(row, col)).toList
      }.toList
    }

    def binomial(n: Int, k: Int): Int = {
      if (k == 0 || k == n) 1
      else binomial(n - 1, k - 1) + binomial(n - 1, k)
    }

    def printTriangle(triangle: List[List[Int]]): Unit = {
      val maxWidth = triangle.last.mkString("   ").length
      triangle.foreach { row =>
        val rowStr = row.mkString("   ")
        val padding = " " * ((maxWidth - rowStr.length) / 2)
        println(padding + rowStr + padding)
      }
    }

    def main(args: Array[String]): Unit = {
      val rows = 10 // Change this value for different sizes
      val triangle = generate(rows)
      printTriangle(triangle)
    }
  }
}