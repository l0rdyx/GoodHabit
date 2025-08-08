package org.glebkrasnopolin.goodhabit.di

import org.glebkrasnopolin.goodhabit.viewmodels.HomeScreenViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

object KoinHelper : KoinComponent {
    private val viewModel: HomeScreenViewModel by inject()

    fun get(): HomeScreenViewModel = viewModel
}
