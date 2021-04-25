package q145_BinaryTreePostorderTraversal

import common.TreeNode
import java.util.*
import kotlin.collections.ArrayList

fun postorderTraversal1(root: TreeNode?): List<Int> {
    return ArrayList<Int>().apply { solution(root, this) }
}

private fun solution(root: TreeNode?, list: ArrayList<Int>) {
    if (root == null) return
    solution(root.left, list)
    solution(root.right, list)
    list.add(root.`val`)
}

fun postorderTraversal2(root: TreeNode?): List<Int> {
    val list = ArrayList<Int>()
    if (root == null) return list
    var node: TreeNode
    val stack = Stack<TreeNode>()
    stack.push(root)
    while (stack.isNotEmpty()) {
        node = stack.pop()
        list.add(0, node.`val`)
        if (node.left != null) stack.add(node.left)
        if (node.right != null) stack.add(node.right)
    }
    return list
}