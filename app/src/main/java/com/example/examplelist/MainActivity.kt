package com.example.examplelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAll()
    }
    val ExampleList = ListExample()
    fun initAll() {
        ExampleList.myList
        ExampleList.myMutableList
        ExampleList.getById(0)
        ExampleList.indexOf(0)
        ExampleList.lastIndexOf(0)
        ExampleList.lastIndex()
        ExampleList.commonCount()
        ExampleList.showSize()
        ExampleList.paramsCount()
        ExampleList.firstElement()
        ExampleList.lastElement()
        ExampleList.findLast()
        ExampleList.findFirst()
        ExampleList.forEach()
        ExampleList.commonFor()
        ExampleList.forEachIndexed()
        ExampleList.commonSorted()
        ExampleList.sortedDescending()
        ExampleList.commonReversed()
        ExampleList.commonContains()
        ExampleList.unCommonContains()
        ExampleList.commonAdd()
        ExampleList.addAll()
        ExampleList.commonShuffle()
        ExampleList.removeAt()
        ExampleList.retainAll()
        ExampleList.commonSet()
        ExampleList.commonClear()
        ExampleList.commonSlice()
        ExampleList.commonMax()
        ExampleList.commonFilter()
        ExampleList.commonMap()
        ExampleList.commonTotal()
        ExampleList.reduceRight()
        ExampleList.commonFold()
        ExampleList.commonChunked()
        ExampleList.commonPartition()
        ExampleList.commonAny()
        ExampleList.commonAll()
        ExampleList.commonDrop()
        ExampleList.dropLast()
        ExampleList.commonTake()
        ExampleList.takeLast()


    }
}
