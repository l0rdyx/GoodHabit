package org.glebkrasnopolin.di

import org.glebkrasnopolin.goodhabit.usecase.HomeScreenViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

object KoinHelper : KoinComponent {
    private val viewModel: HomeScreenViewModel by inject()

    fun get(): HomeScreenViewModel = viewModel
}
