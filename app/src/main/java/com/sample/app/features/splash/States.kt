package com.sample.app.features.splash



sealed class Intents
object Initialize : Intents()

sealed class ViewState
object OnInitializeStarted : ViewState()
object OnInitializeFinished : ViewState()