package common

fun <T> assertEquals(expected: List<T>, actual: List<T>) {
    if (expected.size != actual.size) {
        throw Exception("Comparison Failure.")
    }

    expected.indices.forEach {
        if (expected[it] != actual[it]) {
            throw Exception("Comparison Failure.")
        }
    }
}