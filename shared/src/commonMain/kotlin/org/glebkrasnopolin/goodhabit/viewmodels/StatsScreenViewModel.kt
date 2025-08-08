package org.glebkrasnopolin.goodhabit.viewmodels

import org.glebkrasnopolin.goodhabit.logrepository.repository.LogRepository

class StatsScreenViewModel(
    val logRepository: LogRepository,
) {
    suspend fun onViewAppeared(): List<Pair<Int, Int>> {
        return emptyList()
    }
}