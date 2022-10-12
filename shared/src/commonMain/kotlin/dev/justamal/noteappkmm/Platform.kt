package dev.justamal.noteappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform