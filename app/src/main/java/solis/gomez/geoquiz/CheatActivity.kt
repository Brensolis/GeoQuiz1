package solis.gomez.geoquiz

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private val Any.showAnswerButton: Any
    get() {
        TODO("Not yet implemented")
    }
private val Any.answerTextView: Any
    get() {
        TODO("Not yet implemented")
    }
private val Any.root: Int
    get() {
        TODO("Not yet implemented")
    }
private val ActivityMainBinding.answerTextView: Any
    get() {
        TODO("Not yet implemented")
    }
const val EXTRA_ANSWER_SHOWN = "com.bignerdranch.android.geoquiz.answer_shown"
private const val EXTRA_ANSWER_IS_TRUE =
    "com.bignerdranch.android.geoquiz.answer_is_true"
class CheatActivity<ActivityCheatBinding> : AppCompatActivity() {
    private var binding: ActivityCheatBinding = TODO()
    private var answerIsTrue = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView((binding as Any).root)

        answerIsTrue = intent.getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false)
        (binding as Any).showAnswerButton.setOnclickListener{
            val answerText = when {
                answerIsTrue -> R.string.true_button
                else -> R.string.false_button
            }
            (binding as Any).answerTextView.setText(answerText)
            setAnswerShownResult(true)
        }
    }

    private fun setAnswerShownResult(isAnswerShown: Boolean) {
        val data = Intent ().apply{
            putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown)
        }
        setResult(Activity.RESULT_OK, data)
    }

    companion object {
        fun newIntent(packageContext: Context, answerIsTrue: Boolean): Intent{
         return Intent(packageContext, CheatActivity::class.java).apply{
             putExtra(EXTRA_ANSWER_IS_TRUE, answerIsTrue)
         }
            val data = null
            setResult(Activity.RESULT_OK, data)
        }

        private fun setResult(resultOk: Int, data: Nothing?) {
            TODO("Not yet implemented")
        }

    }
}

private fun Any.setOnclickListener(function: () -> Unit) {
    TODO("Not yet implemented")
}
