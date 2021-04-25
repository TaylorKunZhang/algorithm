package q144_BinaryTreePreorderTraversal

import common.TreeNode
import common.assertEquals

fun main() {
    val node = TreeNode(1)
    node.right = TreeNode(2)
    node.right?.left = TreeNode(3)
    assertEquals(arrayListOf(1, 2, 3), preorderTraversal1(node))
    assertEquals(arrayListOf(1, 2, 3), preorderTraversal2(node))
}