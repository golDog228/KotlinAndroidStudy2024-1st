package com.example.kotlinbasic

import android.util.Log

class Extension01 {
    init {
        Log.d("Extension01", "Extension01 클래스의 객체가 생성되었습니다.")
        val test = Child()
        test.sayBye()
        val childClass = BaseClass.ChildClass()
        childClass.opened()
        val childClass2 = ChildClass2()
        Log.d("Extension01", "childClass2.opened = ${childClass2.opened}")
    }

    // String Extension 테스트 하기
    fun testStringExtension() {
        var original = "Hello"
        var added = " Guys~"
        // plus 함수를 사용해서 문자열을 더할 수 있습니다.
        Log.d("Extension01", "original + added = ${original.plus(added)}")

    }
}
// 상속 연습
open class Parent {
    var hello = "String"
    fun sayHello() {
        Log.d("Extension01", "Parent 클래스의 hello = $hello")
    }
}

class Child : Parent() {
    fun sayBye() {
        hello = "bye"
        sayHello()
    }
}

// 메서드 오버라이드 연습
open class BaseClass {
    open fun opened() {

    }
    fun notOpened() {

    }

    class ChildClass : BaseClass() {
        override fun opened() {
            Log.d("Extension01", "ChildClass 클래스의 opened() 메서드가 호출되었습니다.")
        }
    }
}

// 프로퍼티 오버라이드 연습
open class BaseClass2 {
    open var opened: String = "I am"
}
class ChildClass2 : BaseClass2() {
    override var opened: String = "You are"
}


fun String.plus(word: String): String {
    Log.d("Extension01", "String 클래스의 확장 함수입니다.")
    return this + word
}