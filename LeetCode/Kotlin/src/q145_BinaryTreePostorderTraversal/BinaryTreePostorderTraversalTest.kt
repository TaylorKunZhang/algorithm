package q145_BinaryTreePostorderTraversal

import common.TreeNode
import common.assertEquals

fun main() {
    val node = TreeNode(1)
    node.right = TreeNode(2)
    node.right?.left = TreeNode(3)
    assertEquals(arrayListOf(3, 2, 1), postorderTraversal1(node))
    assertEquals(arrayListOf(3, 2, 1), postorderTraversal2(node))
}