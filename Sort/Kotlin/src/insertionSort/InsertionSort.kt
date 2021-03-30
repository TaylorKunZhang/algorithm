package insertionSort

fun insertionSort(arr: IntArray) {
    var index: Int
    var value: Int
    for (i in 1 until arr.size) {
        index = i
        value = arr[i]
        for (j in i - 1 downTo 0) {
            if (value < arr[j]) {
                arr[j + 1] = arr[j]
                index = j
            } else {
                break
            }
        }
        arr[index] = value
    }
}