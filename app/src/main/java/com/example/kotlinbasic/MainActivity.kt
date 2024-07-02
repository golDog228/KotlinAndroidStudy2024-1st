package com.example.kotlinbasic

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } // 네비게인션바 설정 부분


        binding.btnChange01.setOnClickListener{
            binding.textView01.setText("Hello Kotlin!!")
        }


        // 5. 반환값이 있는 함수 호출
        val test = Function01()
        Log.d("function01","square = ${test.square(30)}")

        // 6. 반환값이 없는 함수
        Log.d("function01", "printSum = ${test.printSum(10, 20)}")

        // 7. 입력 값이 없는 함수
        Log.d("function01", "getPi = ${test.getPi()}")

        // 8. 기본값이 있는 함수
        test.newFunc("Kotlin")


        //9. 파라미터 값 직접 지정하기
        test.newFunc("Kotlin", weight = 70.0)


    }

}