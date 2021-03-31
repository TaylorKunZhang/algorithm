package shellSort

fun shellSort(arr: IntArray) {
    var gap = arr.size / 2
    var index: Int
    var value: Int
    while (gap > 0) {
        for (i in gap until arr.size) {
            index = i
            value = arr[i]
            for (j in i - gap downTo 0 step gap) {
                if (arr[j] > value) {
                    arr[j + gap] = arr[j]
                    index = j
                } else {
                    break
                }
            }
            arr[index] = value
        }
        gap /= 2
    }
}