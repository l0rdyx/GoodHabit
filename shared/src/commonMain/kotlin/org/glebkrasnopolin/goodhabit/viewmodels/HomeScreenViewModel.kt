package org.glebkrasnopolin.goodhabit.viewmodels

import org.glebkrasnopolin.goodhabit.logrepository.models.ActionType
import org.glebkrasnopolin.goodhabit.logrepository.repository.LogRepository

class HomeScreenViewModel(
    val logRepository: LogRepository,
    ) {
    suspend fun beerTap() {
        logRepository.addAction(ActionType.BEER)
    }
}