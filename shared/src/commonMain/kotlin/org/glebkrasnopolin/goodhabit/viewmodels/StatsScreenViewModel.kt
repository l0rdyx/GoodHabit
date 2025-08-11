package org.glebkrasnopolin.goodhabit.viewmodels

import org.glebkrasnopolin.goodhabit.logrepository.repository.LogRepository

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class StatsScreenViewModel(
    private val logRepository: LogRepository
) {
    private val _weeklyStats = MutableStateFlow<List<Pair<Int, Int>>>(emptyList())
    val weeklyStats: StateFlow<List<Pair<Int, Int>>> = _weeklyStats

    private val viewModelScope = CoroutineScope(Dispatchers.Default)

    init {
        loadStats()
    }

    private fun loadStats() {
        viewModelScope.launch {
            val logs = logRepository.getWeeklyStats()
            val grouped = logs
                .groupBy { it.timestamp.toInt() }
                .map { (day, items) -> day to items.size }
                .sortedBy { it.first }
            _weeklyStats.value = grouped
        }
    }
}
