package org.glebkrasnopolin.goodhabit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform