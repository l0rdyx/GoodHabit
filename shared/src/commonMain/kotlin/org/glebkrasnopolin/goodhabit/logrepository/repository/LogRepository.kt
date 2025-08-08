package org.glebkrasnopolin.goodhabit.logrepository.repository

import org.glebkrasnopolin.goodhabit.logrepository.models.ActionLog
import org.glebkrasnopolin.goodhabit.logrepository.models.ActionType

interface LogRepository {
    suspend fun addAction(action: ActionType, value: Long? = null)
    suspend fun getWeeklyStats(): List<ActionLog>
}