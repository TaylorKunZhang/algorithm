package bubbleSort

fun bubbleSortOptimization(arr: IntArray) {
    var temp: Int
    var isExchange: Boolean
    var lastIndex = arr.size - 1
    for (i in arr.indices) {
        isExchange = false
        for (j in 0 until lastIndex) {
            if (arr[j + 1] < arr[j]) {
                temp = arr[j + 1]
                arr[j + 1] = arr[j]
                arr[j] = temp
                isExchange = true
                lastIndex = j
            }
        }
        if (!isExchange) {
            return
        }
    }
}