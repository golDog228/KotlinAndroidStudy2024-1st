package com.example.kotlinbasic

import android.util.Log

class Collection {

    fun muList() { // mutableList는 중복을 허용하고 인덱스 검색 및  get()함수를 사용할 수 있다.
        // 1. 컬렉션 생성하기
        var mutableList = mutableListOf<String>("MON", "TUE", "WED")
        // 값을 추가하기
        mutableList.add("THU")
        // 값을 꺼내기
        Log.d("Collection01", "mutableList 의 첫번째 값은 ${mutableList.get(0)}")
        Log.d("Collection01", "mutableList 의 두번쨰 값은 ${mutableList.get(1)}")

        // 2. 빈 컬렉션 생성 하기
        var stringList = mutableListOf<String>()
        // 값 추가 하기
        stringList.add("월")
        stringList.add("화")
        stringList.add("수")
        // 값을 변경하기
        stringList.set(1,"요일 변경")
        // 사용
        Log.d("Collection01", "stringList의 두번째 값은 ${stringList.get(1)}")
        // 삭제
        stringList.removeAt(1)
        Log.d("Collection01", "stringList의 두번째 값은 ${stringList.get(1)}")
        // 개수를 출력
        Log.d("Collection01", "stringList의 개수는 ${stringList.size}")

    }

    fun muSet() { // mutableSet은 중복을 허용하지 않는다. 인덱스 검색 및 get()함수를 지원 하지 않음

        //1. set 생성하고 값 추가하기
        var set = mutableSetOf<String>()
        set.add("JAN")
        set.add("FEB")
        set.add("MAR")
        set.add("JAN") // 중복된 JAN 값은 set에 추가되지 않는다.

        // 2. 전체 데이터 출력 하기
        Log.d("collection02", "Set 전체 출력: $set")

        // 3. 값 삭제 하기
        set.remove("FEB")
        Log.d("Collection02", "Set 전체 출력: $set")

        // 4. set에 값이 있는지 확인
        if (set.contains("FEB")) {
            Log.d("Collection02", "Set에 FEB 값이 존재합니다.")
        } else {
            Log.d("Collection02", "Set에 FEB 값이 존재하지 않습니다.")
        }

        // 5. set의 size() 함수로 set의 크기를 확인
        Log.d("Collection02", "Set의 크기: ${set.size}")

    }

    fun muMap() { // mutableMap은 키와 값이 쌍으로 입력되는 컬렉션이다 키는 익덱스처럼 사용하고 직접 입력해야한다.
        // 값을 추가하기 위해서는 put()함수를 사용 할 수 있다
        // 1. map 생성 하기
        var map = mutableMapOf<Int, String>()
        // 2. 값 넣기
        map.put(1, "data01")
        map.put(2, "data02")
        map.put(3, "data03")

        // 3. map에서 값 사용하기
        var mapData = map.get(1)
        Log.d("Collection03", "mapData: $mapData")

        // 4. map에서 값 수정하기
        map.put(1, "data01_updated")
        mapData = map.get(1)
        Log.d("Collection03", "mapData: $mapData")

        // 5. map에서 값 삭제하기
        map.remove(2)
        Log.d("Collection03", "mapData: ${map.get(2)}")

        // 6. map의 size() 함수로 map의 크기를 확인
        Log.d("Collection03", "map의 크기: ${map.size}")

        // 7. map.keys()로 key만 list로 받아서 사용
        var keyList = map.keys.toList()
        Log.d("Collection03", "keyList: $keyList")

        // 8. map.values()로 value만 list로 받아서 사용
        var valueList = map.values.toList()
        Log.d("Collection03","valueList: $valueList")



    }
}