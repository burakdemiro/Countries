package com.ekarte.countries.di

import com.ekarte.countries.model.CountriesService
import com.ekarte.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}