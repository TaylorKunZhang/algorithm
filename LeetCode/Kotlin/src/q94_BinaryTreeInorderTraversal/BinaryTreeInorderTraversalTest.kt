package q94_BinaryTreeInorderTraversal

import common.TreeNode
import common.assertEquals

fun main() {
    val node = TreeNode(1)
    node.right = TreeNode(2)
    node.right?.left = TreeNode(3)
    assertEquals(arrayListOf(1, 3, 2), inorderTraversal1(node))
    assertEquals(arrayListOf(1, 3, 2), inorderTraversal2(node))
}