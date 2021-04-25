package q94_BinaryTreeInorderTraversal

import common.TreeNode
import java.util.*
import kotlin.collections.ArrayList

fun inorderTraversal1(root: TreeNode?): List<Int> {
    return ArrayList<Int>().apply { solution(root, this) }
}

private fun solution(root: TreeNode?, list: ArrayList<Int>) {
    if (root == null) return
    solution(root.left, list)
    list.add(root.`val`)
    solution(root.right, list)
}

fun inorderTraversal2(root: TreeNode?): List<Int> {
    var node = root
    val stack = Stack<TreeNode>()
    val list = ArrayList<Int>()
    while (node != null || stack.isNotEmpty()) {
        while (node != null) {
            stack.push(node)
            node = node.left
        }
        if (stack.isNotEmpty()) {
            node = stack.pop()
            list.add(node.`val`)
            node = node.right
        }
    }
    return list
}