package q144_BinaryTreePreorderTraversal

import common.TreeNode
import java.util.*
import kotlin.collections.ArrayList

fun preorderTraversal1(root: TreeNode?): List<Int> {
    return ArrayList<Int>().apply {
        solution1(root, this)
    }
}

private fun solution1(root: TreeNode?, list: ArrayList<Int>) {
    if (root == null) return
    list.add(root.`val`)
    solution1(root.left, list)
    solution1(root.right, list)
}

fun preorderTraversal2(root: TreeNode?): List<Int> {
    var node = root
    val stack = Stack<TreeNode>()
    val list = ArrayList<Int>()
    while (node != null) {
        while (node != null) {
            list.add(node.`val`)
            if (node.right != null) {
                stack.push(node.right)
            }
            node = node.left
        }
        if (stack.isNotEmpty()) {
            node = stack.pop()
        }
    }
    return list
}