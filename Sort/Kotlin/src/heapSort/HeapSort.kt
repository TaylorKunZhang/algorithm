package heapSort

fun heapSort(arr: IntArray) {
    val length = arr.size - 1
    for (i in arr.size / 2 - 1 downTo 0) {
        maxHeapify(arr, i, length)
    }
    for (i in length downTo 1) {
        swap(arr, 0, i)
        maxHeapify(arr, 0, i - 1)
    }
}

private fun maxHeapify(arr: IntArray, index: Int, length: Int) {
    val left = index * 2 + 1
    val right = left + 1
    if (left > length) return
    val max = if (right <= length && arr[right] > arr[left]) right else left
    if (arr[index] < arr[max]) {
        swap(arr, index, max)
        maxHeapify(arr, max, length)
    }
}

private fun swap(arr: IntArray, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}