package task.of25
//Define a recursive data structure for binary trees:
//    ******
//    sealed trait Tree
//    case class Node(value: Int, left: Tree, right: Tree) extends Tree
//    case object Leaf extends Tree
//    *****
//    Write a function sumTree(tree: Tree): Int that
//    computes the sum of all node values using pattern matching.

object BinaryTree extends App{
  sealed trait Tree
  case class Node(value: Int, left: Tree, right: Tree) extends Tree
  case object Leaf extends Tree

  def sumTree(tree: Tree): Int ={
    tree match {
      case Leaf => 0
      case Node(value: Int, left: Tree, right: Tree) => value + sumTree(left) + sumTree(right)
    }
  }
  println(sumTree(Node(5,Node(1,Leaf,Leaf),Node(7,Leaf,Leaf))))
  println(sumTree(Node(5,Leaf,Leaf)))

}
