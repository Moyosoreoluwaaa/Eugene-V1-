package com.example.di.viewmodel

import androidx.lifecycle.ViewModel
import com.example.domain.usecase.prediction.GetFilteredPredictionsUseCase
import com.example.domain.usecase.prediction.GetNotableSecondersUseCase
import com.example.domain.usecase.second.CastSecondUseCase
import com.example.domain.usecase.second.RecordSecondingSnapshotUseCase
import com.example.domain.usecase.submission.SubmitPredictionUseCase
import com.example.domain.usecase.discourse.PostDiscourseEntryUseCase
import com.example.domain.usecase.keeptab.ToggleKeepTabUseCase
import com.example.domain.usecase.auth.LoginUseCase
import com.example.domain.usecase.auth.SignUpUseCase
import com.example.domain.repository.PredictionRepository
import com.example.domain.repository.SecondRepository
import com.example.domain.repository.CommentRepository
import com.example.domain.repository.DiscourseRepository
import com.example.domain.repository.SecondingSnapshotRepository
import com.example.domain.repository.SubmissionRepository
import com.example.domain.repository.AuthRepository
import com.example.domain.repository.PreferencesRepository
import com.example.domain.repository.KeepTabRepository

class HomeFeedViewModel(
    val getFilteredPredictions: GetFilteredPredictionsUseCase,
    val authRepository: AuthRepository
) : ViewModel()

class ExploreViewModel(
    val getFilteredPredictions: GetFilteredPredictionsUseCase
) : ViewModel()

class PredictionDetailViewModel(
    val getNotableSeconders: GetNotableSecondersUseCase,
    val castSecond: CastSecondUseCase,
    val predictionRepository: PredictionRepository,
    val commentRepository: CommentRepository,
    val discourseRepository: DiscourseRepository,
    val authRepository: AuthRepository,
    val toggleKeepTab: ToggleKeepTabUseCase
) : ViewModel()

class CreatePredictionViewModel(
    val submitPrediction: SubmitPredictionUseCase,
    val authRepository: AuthRepository
) : ViewModel()

class ProfileViewModel(
    val authRepository: AuthRepository,
    val toggleKeepTab: ToggleKeepTabUseCase,
    val keepTabRepository: KeepTabRepository
) : ViewModel()

class LeaderboardViewModel(
    val keepTabRepository: KeepTabRepository,
    val toggleKeepTab: ToggleKeepTabUseCase
) : ViewModel()

class SettingsViewModel(
    val preferencesRepository: PreferencesRepository,
    val authRepository: AuthRepository
) : ViewModel()

class NotificationsViewModel : ViewModel()
