package org.glebkrasnopolin.goodhabit.repository

import org.glebkrasnopolin.goodhabit.models.ActionLog
import org.glebkrasnopolin.goodhabit.models.ActionType

interface LogRepository {
    suspend fun addAction(action: ActionType, value: Long? = null)
    suspend fun getWeeklyStats(): List<ActionLog>
}