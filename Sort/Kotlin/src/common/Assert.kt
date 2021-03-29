package common

fun assertEquals(expected: IntArray, actual: IntArray) {
    if (expected.size != actual.size) {
        throw Exception("Comparison Failure.")
    }

    expected.indices.forEach {
        if (expected[it] != actual[it]) {
            throw Exception("Comparison Failure.")
        }
    }
}