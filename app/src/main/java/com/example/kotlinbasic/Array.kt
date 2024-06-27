package com.example.kotlinbasic

import android.util.Log

class Array {
    fun main() {
        // 1. 기본 배열 선언, 10개의 빈공간이 할당됨
        var students = IntArray(10)
        var longArray = LongArray(10)
        var charArray = CharArray(10)
        var floatArray = FloatArray(10)
        var doubleArray = DoubleArray(10)
        // arrayOf() 함수를 이용하면 선언과 동시에 값을 입력 가능
        var intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        //2. 문자열 타입 배열 선언 하기
        var streingArray = Array(10, { item -> "" })
        // arrayOf() 함수로 값을 직접 입력해서 배열을 생성할 수 있다.
        var dayArray = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

        //3. 앞에서 선언한 student 변수에 값 넣기
        // 대괄호 사용
        students[0] = 1
        students[1] = 2
        students[2] = 3
        students[3] = 4
        students[4] = 5
        // set() 함수 사용
        students.set(5, 60)
        students.set(6, 70)
        students.set(7, 80)
        students.set(8, 90)
        students.set(9, 100)

        // 4. 값 변경하기
        intArray[6] = 100
        intArray.set(9,200)

        // 5. 값 사용하기
        var seventhValue = intArray[6]
        Log.d("Array1","열덟 번째 intArray의 값은 ${seventhValue}입니다.")
        var tenthValue = intArray.get(9)
        Log.d("Array1", "열번째 intArray의 값은 $tenthValue 입니다")

        // 6. 변수에 넣지 않고 직접 사용
        Log.d("Array1", "첫번째 dayArray의 값은${dayArray[0] ?: 0}이다")
        Log.d("Array1", "여섯 번째 dayArray의 값은${dayArray.get(5)} 이다")
    }
}