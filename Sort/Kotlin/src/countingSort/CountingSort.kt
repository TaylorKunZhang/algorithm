package countingSort

fun countingSort(arr: IntArray) {
    if (arr.isEmpty()) return
    var min = arr[0]
    var max = arr[0]
    for (value in arr) {
        if (value < min) min = value
        if (value > max) max = value
    }

    val cArr = IntArray(max - min + 1) { 0 }
    for (value in arr) {
        cArr[value - min]++
    }
    for (i in 1 until cArr.size) {
        cArr[i] = cArr[i] + cArr[i - 1]
    }

    val bArr = IntArray(arr.size)
    for (i in arr.indices) {
        val num = arr[i]
        val index = --cArr[num - min]
        bArr[index] = num
    }
    for (i in arr.indices) {
        arr[i] = bArr[i]
    }
}