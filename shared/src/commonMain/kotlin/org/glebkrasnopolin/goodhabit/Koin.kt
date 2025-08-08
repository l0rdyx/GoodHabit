package org.glebkrasnopolin.goodhabit

import models.Logs
import org.glebkrasnopolin.goodhabit.logrepository.repository.LogRepository
import org.glebkrasnopolin.goodhabit.logrepository.repository.LogRepositoryImpl
import org.glebkrasnopolin.goodhabit.viewmodels.HomeScreenViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule = module {
    includes(platformModule)
    single<LogRepository> { LogRepositoryImpl(get()) }
    single { Logs(get()) }  // AppDatabase
    single { HomeScreenViewModel(get()) }
}

internal expect val platformModule: Module
