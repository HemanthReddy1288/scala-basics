
object Main extends App{

  {

    // Assigning values
    val name = "GeeksforGeeks"
    val articles = 32

    // Applying StringContext with
    // s-method
    val result = StringContext("I have written ",
      " articles on ", ".").s(articles, name)

    // Displays output
    println(result)

  }
}

