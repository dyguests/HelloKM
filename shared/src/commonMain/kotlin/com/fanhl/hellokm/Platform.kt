package com.fanhl.hellokm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform