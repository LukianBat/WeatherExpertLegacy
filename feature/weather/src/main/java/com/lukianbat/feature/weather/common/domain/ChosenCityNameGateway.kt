package com.lukianbat.feature.weather.common.domain

import com.lukianbat.core.di.FlowScope
import javax.inject.Inject

@FlowScope
class ChosenCityNameGateway @Inject constructor() {
    var cityName: String = ""
}
