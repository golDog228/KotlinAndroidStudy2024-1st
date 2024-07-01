package com.example.kotlinbasic

import android.util.Log

class ControlFlowFor {

    fun controlFor() {
        // 1. for loop
        for (index in 1..10) {
            Log.d("controlFor01","현재 숫자는 " + index)
        }
        // 2. for until 마지막 숫자 제외하기
        var days = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thu")
        for(index in 0 until days.size  ) {
            Log.d("controlFor01","현재 월은 "+days.get(index)+" 현재 index는 " + index)
        }

        // 3. for step
        for (index in 0..10 step 2) {
            Log.d("controlFor01", "step = " + index)
        }
        // 4. for downTo
        for (index in 10 downTo 0) {
            Log.d("controlFor01", "downTo =  " + index+"")
        }

        // 5. for downTo step
        for (index in 10 downTo 0 step 2) {
            Log.d("controlFor01", "downTo step = " + index)
        }

    }
}