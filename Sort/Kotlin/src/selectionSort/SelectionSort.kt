package selectionSort

fun selectionSort(arr: IntArray) {
    var minIndex: Int
    var temp: Int
    for (i in arr.indices) {
        minIndex = i
        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }
        if (minIndex != i) {
            temp = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = temp
        }
    }
}