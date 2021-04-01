package mergeSort

fun mergeSort(arr: IntArray) {
    mSort(arr, IntArray(arr.size), 0, arr.size - 1)
}

private fun mSort(arr: IntArray, temp: IntArray, left: Int, right: Int) {
    if (left >= right) {
        return
    }

    val mid = (left + right) / 2
    mSort(arr, temp, left, mid)
    mSort(arr, temp, mid + 1, right)

    var i = left
    var j = mid + 1
    var t = left
    while (i <= mid && j <= right) {
        temp[t++] = if (arr[i] < arr[j]) arr[i++] else arr[j++]
    }
    while (i <= mid) {
        temp[t++] = arr[i++]
    }
    while (j <= right) {
        temp[t++] = arr[j++]
    }
    for (k in left..right) {
        arr[k] = temp[k]
    }
}