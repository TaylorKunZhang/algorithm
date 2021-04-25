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
    val list = ArrayList<Int>()
    if (root == null) return list

    var node: TreeNode?
    val stack = Stack<TreeNode>()
    stack.push(root)
    while (stack.isNotEmpty()) {
        node = stack.pop()
        list.add(node.`val`)
        if (node.right != null) stack.push(node.right)
        if (node.left != null) stack.push(node.left)
    }
    return list
}