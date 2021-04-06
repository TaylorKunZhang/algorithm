package bucketSort

fun bucketSort(arr: IntArray) {
    if (arr.isEmpty()) return
    var min = arr[0]
    var max = arr[0]
    for (value in arr) {
        if (value < min) {
            min = value
        } else if (value > max) {
            max = value
        }
    }

    val bucketNum = (max - min) / arr.size + 1
    val buckList = ArrayList<ArrayList<Int>>()
    for (i in 0 until bucketNum) {
        buckList.add(ArrayList())
    }
    for (i in arr.indices) {
        val num = (arr[i] - min) / arr.size
        buckList[num].add(arr[i])
    }

    var index = 0
    for (list in buckList) {
        list.sort()
        for (k in list) {
            arr[index++] = k
        }
    }
}