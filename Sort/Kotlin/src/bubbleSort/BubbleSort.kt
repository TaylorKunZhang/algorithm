package bubbleSort

fun bubbleSort(arr: IntArray) {
    var temp: Int
    for (i in arr.indices) {
        for (j in 0 until arr.size - 1 - i) {
            if (arr[j + 1] < arr[j]) {
                temp = arr[j + 1]
                arr[j + 1] = arr[j]
                arr[j] = temp
            }
        }
    }
}