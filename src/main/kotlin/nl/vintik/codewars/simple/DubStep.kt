package nl.vintik.codewars.simple

import java.util.*
import java.util.function.Predicate
import java.util.stream.Collectors

    fun songDecoder(song: String): String? {
        val splitInputString = song.split("WUB".toRegex()).toTypedArray()
        return Arrays.stream(splitInputString).filter(Predicate.not { obj: String -> obj.isBlank() }).collect(Collectors.joining(" "))
    }