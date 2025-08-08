package org.glebkrasnopolin.goodhabit.repository

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import models.Logs
import org.glebkrasnopolin.goodhabit.models.ActionLog
import org.glebkrasnopolin.goodhabit.models.ActionType

class LogRepositoryImpl(
    private val db: Logs
): LogRepository {
    override suspend fun addAction(action: ActionType, value: Long?) {
        val now: Instant = Clock.System.now()
        db.logQueries.insert(
            action.name,
            timestamp = now.toEpochMilliseconds(),
            value_ = value ?: 0
        )
        /*
        val allLogs = db.logQueries.selectAll().executeAsList()
        println(allLogs)
        */
    }

    override suspend fun getWeeklyStats(): List<ActionLog> {
        TODO("Not yet implemented")
    }
}