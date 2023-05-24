package solis.gomez.geoquiz

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout.TabGravity
import kotlin.properties.ReadOnlyProperty

val correctAnswer: Any?
    get() {
        TODO()
    }
val userAnswer: Any
    get() {
        TODO()
    }
private val Any.isCheater: Any
    get() {
        TODO("Not yet implemented")
    }
val quizViewModel: Any
    get() {
        TODO()
    }
private val Nothing?.data: Any
    get() {
        TODO("Not yet implemented")
    }
private val Nothing?.resultCode: Any
    get() {
        TODO("Not yet implemented")
    }
private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val quizViewModel: QuizViewModel by viewModels()

    private fun viewModels(): ReadOnlyProperty<MainActivity, QuizViewModel> {
        TODO("Not yet implemented")
    }

    private val cheatLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        val result = null
        if (result.resultCode == Activity.RESULT_OK) {
            quizViewModel.isCheater =
                (result.data?.getBooleanExtra(EXTRA_ANSWER_SHOWN, false) ?: false) as Boolean
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate(Bundle?) called")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG,"Got a QuizViewModel: $quizViewModel" )

        binding.trueButton.setOnClickListener { view: View ->
            checkAnswer(true)
        }
        binding.falseButton.setOnClickListener { view: View ->
            checkAnswer(false)
        }
        binding.nextButton.setOnClickListener {
            quizViewModel.moveToNext()
            updateQuestion()
        }
        binding.cheatButton.setOnClickListener{
            //Start CheatActivity
            
            val answerIsTrue = quizViewModel.currentQuestionAnswer
            val intent = CheatActivity.newIntent(this@MainActivity, answerIsTrue)
            val cheatLauncher = null
            cheatLauncher.launch(intent)
            
        }
        updateQuestion()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy() called")
    }

    private fun updateQuestion() {
        val questionTextResId = quizViewModel.currentQuestionText
        binding.questionTextView.setText(questionTextResId)
        TODO("Not yet implemented")
    }
    private fun checkAnswer(userAnswer: Boolean) {

        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT)
    }
    }
    val messageResId = when {
        quizViewModel.isCheater as Boolean -> R.string.judgment_toast
        userAnswer == correctAnswer -> R.string.correct_toast
        else -> R.string.incorrect_toast
    }

private fun Any.getBooleanExtra(extraAnswerShown: String, b: Boolean) {

}

private fun Nothing?.launch(intent: Intent) {

}


fun Any.setText(questionTextResId: Int) {

    }

    private fun Any.setOnClickListener(function: (View) -> Unit) {
        TODO("Not yet implemented")
    }

    fun ActivityMainBinding.Companion.inflate(layoutInflater: LayoutInflater): ActivityMainBinding {
        TODO("Not yet implemented")
    }

    class ActivityMainBinding(val root: Int) {
        val showAnswerButton: Any
            get() {
                TODO()
            }
        val cheatButton: Any
            get() {
                TODO()
            }
        val nextButton: Any
            get() {
                TODO()
            }
        val questionTextView: Any
            get() {
                TODO()
            }
        val falseButton: Any
            get() {
                TODO()
            }
        val trueButton: Any
            get() {
                TODO()
            }

        companion object

    }

