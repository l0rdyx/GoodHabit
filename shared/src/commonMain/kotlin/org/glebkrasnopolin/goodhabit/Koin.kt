package org.glebkrasnopolin.goodhabit

import models.Logs
import org.glebkrasnopolin.goodhabit.repository.LogRepository
import org.glebkrasnopolin.goodhabit.repository.LogRepositoryImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule = module {
    includes(platformModule)
    single<LogRepository> { LogRepositoryImpl(get()) }
    single { Logs(get()) }  // AppDatabase
}

internal expect val platformModule: Module
