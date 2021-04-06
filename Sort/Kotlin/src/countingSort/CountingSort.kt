package countingSort

fun countingSort(arr: IntArray) {
    if (arr.size < 2) return
    var min = arr[0]
    var max = arr[0]
    var num: Int
    for (i in 1 until arr.size) {
        num = arr[i]
        if (num < min) {
            min = num
        } else if (num > max) {
            max = num
        }
    }

    val cArr = IntArray(max - min + 1) { 0 }
    for (value in arr) {
        cArr[value - min]++
    }
    for (i in 1 until cArr.size) {
        cArr[i] = cArr[i] + cArr[i - 1]
    }

    val bArr = IntArray(arr.size)
    var index: Int
    for (i in arr.indices) {
        num = arr[i]
        index = --cArr[num - min]
        bArr[index] = num
    }
    for (i in arr.indices) {
        arr[i] = bArr[i]
    }
}