package org.glebkrasnopolin.goodhabit

import org.glebkrasnopolin.goodhabit.repository.LogRepository
import org.glebkrasnopolin.goodhabit.repository.LogRepositoryImpl
import org.koin.dsl.module
import usecase.LogUseCase

val appModule = module {
    single<LogRepository> { LogRepositoryImpl() }
    single { LogUseCase(get()) }
}