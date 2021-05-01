package nl.vintik.codewars.simple

fun toCamelCase(inputString: String?): String? {
    if (inputString != null && inputString.isNotEmpty()) {
        val result = StringBuilder(inputString.length)
        val splitInputString = inputString.split("[_-]".toRegex()).toTypedArray()
        for (i in splitInputString.indices) {
            val word = splitInputString[i]
            if (word.isNotEmpty()) {
                if (i == 0) { //first word, keep case
                    result.append(word[0])
                } else {
                    result.append(word.substring(0, 1).toUpperCase())
                }
                result.append(word.substring(1).toLowerCase())
            }
        }
        return result.toString()
    }
    return ""
}