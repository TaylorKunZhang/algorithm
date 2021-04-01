package mergeSort

import common.assertEquals

fun main() {
    val arr = intArrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5)
    val expectedArr = intArrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10)
    mergeSort(arr)
    assertEquals(expectedArr, arr)
}