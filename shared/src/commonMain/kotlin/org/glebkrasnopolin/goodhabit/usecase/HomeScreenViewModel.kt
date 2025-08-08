package org.glebkrasnopolin.goodhabit.usecase

import org.glebkrasnopolin.goodhabit.models.ActionType
import org.glebkrasnopolin.goodhabit.repository.LogRepository

class HomeScreenViewModel(
    val logRepository: LogRepository,
    ) {
    suspend fun beerTap() {
        logRepository.addAction(ActionType.BEER)
    }
}