package solis.gomez.geoquiz

import org.junit.Assert.*
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith
class MainActivityTest {

    private lateinit var scenario: ActivityScenario<MainActivity>
    @Before
    fun setUp() {
        scenario = launch(MainActivity::class.java)
    }

    private fun launch(java: Class<MainActivity>): Any {
        TODO("Not yet implemented")
    }

    @After
    fun tearDown() {
    }
}