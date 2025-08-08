package org.glebkrasnopolin.di

import org.glebkrasnopolin.goodhabit.appModule
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(appModule)
    }
}
