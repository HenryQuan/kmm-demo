package io.github.henryquan.kmmdemo

import kotlin.test.Test
import kotlin.test.assertTrue

class JsGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greet().contains("Java"), "Check JavaScript is mentioned")
    }
}