package quickSort

fun quickSort(arr: IntArray) {
    qSort(arr, 0, arr.size - 1)
}

private fun qSort(arr: IntArray, left: Int, right: Int) {
    if (left >= right) {
        return
    }

    val pivotIndex = partition(arr, left, right)
    qSort(arr, left, pivotIndex - 1)
    qSort(arr, pivotIndex + 1, right)
}

private fun partition(arr: IntArray, left: Int, right: Int): Int {
    val pivot = arr[left]
    var low = left
    var high = right
    while (low < high) {
        while (low < high && arr[high] >= pivot) high--
        arr[low] = arr[high]
        while (low < high && arr[low] <= pivot) low++
        arr[high] = arr[low]
    }
    arr[low] = pivot
    return low
}