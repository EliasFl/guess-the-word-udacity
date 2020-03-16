package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(private val finalScore: Int): ViewModel() {

    private var _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    private var _canPlayAgain = MutableLiveData<Boolean>()
    val canPlayAgain: LiveData<Boolean>
        get() = _canPlayAgain

    init {
        Log.i("ScoreViewModel", "The final score is: $finalScore")

        _score.value = finalScore
    }

    fun onPlayAgain() {
        _canPlayAgain.value = true
    }

    fun gameCompleted() {
        _canPlayAgain.value = false
    }

}