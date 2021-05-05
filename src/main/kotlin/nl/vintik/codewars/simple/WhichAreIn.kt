package nl.vintik.codewars.simple

fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
    if(array1.isEmpty() || array2.isEmpty()){
        return emptyArray()
    }
    return array1.filter { item1 -> array2.any { item1 in it} }.distinct().sorted().toTypedArray()
}