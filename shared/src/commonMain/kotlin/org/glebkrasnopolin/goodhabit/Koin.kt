package org.glebkrasnopolin.goodhabit

import models.Logs
import org.glebkrasnopolin.goodhabit.repository.LogRepository
import org.glebkrasnopolin.goodhabit.repository.LogRepositoryImpl
import org.glebkrasnopolin.goodhabit.usecase.HomeScreenViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule = module {
    includes(platformModule)
    single<LogRepository> { LogRepositoryImpl(get()) }
    single { Logs(get()) }  // AppDatabase
    single { HomeScreenViewModel(get()) }
}

internal expect val platformModule: Module
