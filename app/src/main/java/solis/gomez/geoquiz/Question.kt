package solis.gomez.geoquiz

import androidx.annotation.StringRes

data class Question (@StringRes val textResId: Int, val answer: Boolean) {
    infix fun Question(questionOceans: Int): Boolean {

    }
}