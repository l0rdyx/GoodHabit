package org.glebkrasnopolin.goodhabit.models

data class ActionLog (
    val type: ActionType,
    val timestamp: Long,
    val value: Double? = null,
    // val actionTrendMoralEvaluation: Boolean?
)