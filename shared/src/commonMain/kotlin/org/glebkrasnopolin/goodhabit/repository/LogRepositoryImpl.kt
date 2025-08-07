package org.glebkrasnopolin.goodhabit.repository

import org.glebkrasnopolin.goodhabit.models.ActionLog
import org.glebkrasnopolin.goodhabit.models.ActionType

class LogRepositoryImpl: LogRepository {
    override suspend fun addAction(action: ActionType) {
        TODO("Not yet implemented")
    }

    override suspend fun getWeeklyStats(): List<ActionLog> {
        TODO("Not yet implemented")
    }
}