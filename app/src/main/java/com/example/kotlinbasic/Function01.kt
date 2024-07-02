package com.example.kotlinbasic

import android.util.Log

class Function01 {

    // 1. 반환값이 있는 함수
    fun square(x: Int): Int {
        return x * x
    }

    // 2. 반환값이 없는 함수
    fun printSum(x: Int, y: Int) {
        Log.d("function01", "x + y =" + (x + y))

    }

    // 3. 입력값 없이 반환값만 있는 함수
    fun getPi(): Double {
        return 3.141592
    }

    // 4. 기본값은 갖는 함수
    fun newFunc(name: String, age: Int = 29, weight: Double = 65.7) {
        Log.d("function01", "name = $name")
        Log.d("function01","age = $age")
        Log.d("function01","weight = $weight")

    }



}