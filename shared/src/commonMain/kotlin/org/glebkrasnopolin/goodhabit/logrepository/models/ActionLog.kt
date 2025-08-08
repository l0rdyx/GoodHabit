package org.glebkrasnopolin.goodhabit.logrepository.models

data class ActionLog (
    val type: ActionType,
    val timestamp: Long,
    val value: Int? = null,
    // val actionTrendMoralEvaluation: Boolean?
)