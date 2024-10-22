package com.example.kmp_dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform