package radixSort

fun radixSort(arr: IntArray) {
    if (arr.size < 2) return
    var max = arr[0]
    for (i in 1 until arr.size) {
        if (max < arr[i]) {
            max = arr[i]
        }
    }
    var maxDigit = 0
    while (max != 0) {
        max /= 10
        maxDigit++
    }

    val bucketList = ArrayList<ArrayList<Int>>(10)
    for (i in 0 until 10) {
        bucketList.add(ArrayList())
    }
    var mod = 10
    var div = 1
    var num: Int
    var index: Int
    for (i in 0 until maxDigit) {
        for (k in arr) {
            num = (k % mod) / div
            bucketList[num].add(k)
        }
        index = 0
        for (list in bucketList) {
            for (k in list) {
                arr[index++] = k
            }
            list.clear()
        }
        mod *= 10
        div *= 10
    }
}