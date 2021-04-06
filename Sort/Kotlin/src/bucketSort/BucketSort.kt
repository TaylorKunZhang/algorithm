package bucketSort

fun bucketSort(arr: IntArray) {
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

    val bucketNum = (max - min) / arr.size + 1
    val bucketList = ArrayList<ArrayList<Int>>()
    for (i in 0 until bucketNum) {
        bucketList.add(ArrayList())
    }
    for (i in arr.indices) {
        num = (arr[i] - min) / arr.size
        bucketList[num].add(arr[i])
    }

    var index = 0
    for (list in bucketList) {
        list.sort()
        for (k in list) {
            arr[index++] = k
        }
    }
}