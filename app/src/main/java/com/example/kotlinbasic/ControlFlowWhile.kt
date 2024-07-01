package com.example.kotlinbasic

import android.util.Log

class ControlFlowWhile {

    fun controlWhile() {

        // 1. while
        var current = 1
        val until = 12
        while (current <= until) {
            Log.d("controlWhile01", "current = " + current)
            current++
        }

        // 2. do-while
        var game = 5
        val match = 6
        do {
            Log.d("controlWhile01", "do~while game = " + game)
            game++
        } while (game < match)


        // 3. do-while 과 while 비교
        while (game < match) {
            Log.d("controlWhile01", "while game = " + game)
            game++
        }

        // 4. break
        game = 1
        while (game <= match) {
            if (game > 3) {
                break
            }
            Log.d("controlWhile01", "break game = " + game)
            game++

        }

        // 5. continue
        game = 1
        while (game <= match) {
            if (game % 2 == 0) {
                game++
                continue
            }
            Log.d("controlWhile01", "continue game = " + game)
            game++
        }



    }
}