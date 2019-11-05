package com.example.examplelist

import android.util.Log

class ListExample()
{


    companion object {
        const val TAG = "mylist"
    }

    val myList=listOf(1,2,3,4,5)
    val myMutableList = mutableListOf("11", "22", "33", "44", "55")



    fun getById(index: Int): Int {

        val element = myList.get(index)
        Log.d(TAG, "getById($index): $element")
        return element
    }

    fun indexOf(element: Int): Int {
        val index = myList.indexOf(element)
        Log.d(TAG, "indexOf($element):$index")
        return index
    }

    fun lastIndexOf(element: Int): Int {
        val index = myList.lastIndexOf(element)
        Log.d(TAG, "lastIndexOf($element):$index")
        return index
    }

    fun lastIndex(): Int {
        val index = myList.lastIndex
        Log.d(TAG, "lastIndex : $index")
        return index
    }

    fun commonCount(): Int {
        val qty = myList.count()
        Log.d(TAG, "commonCount $qty elements")
        return qty
    }

    fun showSize(): Int {
        val qty = myList.size
        Log.d(TAG, "showSize : $qty")
        return qty
    }

    fun paramsCount(): Int {
        val qty = myList.count { p -> p < 0 }
        Log.d(TAG, "paramsCount p<0 : $qty")
        return qty
    }

    fun firstElement(): Int {
        val element = myList.first()
        Log.d(TAG, "firstElemtnt : $element")
        return element
    }

    fun lastElement(): Int {
        val element = myList.last()
        Log.d(TAG, "lastElement : $element")
        return element
    }

    fun findLast(): String? {
        val element = myMutableList.findLast { element -> element.startsWith('2') }
        Log.d(TAG, "Last element start with '2' : $element")
        return element
    }

    fun findFirst(): String {
        val element = myMutableList.first { element -> element.startsWith('2') }
        Log.d(TAG, "First element start with '2' : $element")
        return element
    }

    fun forEach() {
        return myList.forEach { elements -> Log.d(TAG, "forEach : $elements") }
    }

    fun commonFor() {
        for (i in 0 until myList.size)
            Log.d(TAG, "commonFor : ${myList[i]}")
    }

    fun forEachIndexed() {
        myList.forEachIndexed { i, e -> Log.d(TAG, "forEachIndexed : myList[$i] = $e") }
    }

    fun commonSorted(): List<Int> {
        val elements = myList.sorted()
        Log.d(TAG, "common sorted : $elements")
        return elements
    }

    fun sortedDescending(): List<Int> {
        val elements = myList.sortedDescending()
        Log.d(TAG, "sortedDescending : $elements")
        return elements
    }

    fun commonReversed(): List<Int> {
        val elements = myList.reversed()
        Log.d(TAG, "commonReversed : $elements")
        return elements
    }

    fun commonContains(): Boolean {
        val result = myList.contains(3)
        if (result) Log.d(TAG, "commonContains : 3 is present")
        return result
    }

    fun unCommonContains(): Boolean {
        val result = myList.containsAll(listOf(1, 4))
        if (result) Log.d(TAG, "unCommonContains : 1 and 4 is present")
        return result
    }

    fun commonAdd(): MutableList<String> {
        myMutableList.add("El")
        Log.d(TAG, "commonAdd : $myMutableList")
        return myMutableList
    }

    fun addAll(): MutableList<String> {
        myMutableList.addAll(listOf("El1", "El2"))
        Log.d(TAG, "addAll : $myMutableList")
        return myMutableList
    }

    fun commonShuffle(): MutableList<String> {
        myMutableList.shuffle()
        Log.d(TAG, "shuffle : $myMutableList")
        return myMutableList
    }

    fun removeAt(): MutableList<String> {
        myMutableList.removeAt(3)
        Log.d(TAG, "removeAt : $myMutableList")
        return myMutableList
    }

    fun retainAll() {
        myMutableList.retainAll(listOf("11", "11"))
    }

    fun commonSet(): MutableList<String> {
        myMutableList.set(0, "El")
        Log.d(TAG, "Set : $myMutableList")
        return myMutableList
    }

    fun commonClear(): MutableList<String> {
        myMutableList.clear()
        Log.d(TAG, "myMutableList it's $myMutableList (null)")
        return myMutableList
    }

    fun commonSlice(): List<String> {
        val newMutableList = myMutableList.slice(listOf(0, 1, 2, 3))
        Log.d(TAG, "Slice : $newMutableList")
        return newMutableList
    }

    fun commonMax(): Int? {
        val element = myList.max()
        Log.d(TAG, "Max element : $element")
        return element
    }

    fun commonFilter(): List<String> {
        val elements = myMutableList.filter { e -> e.length == 5 }
        Log.d(TAG, "filter : $elements")
        return elements
    }

    fun commonMap(): List<Int> {
        val e = myList.map { e -> e * 2 }
        Log.d(TAG, "Map (*2) : $e")
        return e
    }

    fun commonTotal(): Int {
        val total = myList.reduce { total, next -> total + next }
        Log.d(TAG, "commonTotal : $total")
        return total
    }

    fun reduceRight(): String {
        val res = myMutableList.reduceRight { next, total -> "$total-$next" }
        Log.d(TAG, "reduceRight : $res")
        return res
    }

    fun commonFold(): Int {
        var fold = 3
        val res = myList.fold( fold) { total, next -> total - next }
        Log.d(TAG, "commonFold : $res")
        return res
    }

    fun commonChunked(): Int {
        val res = myList.chunked(2).fold(0) { total, next -> total + next[0] * next[1] }
        Log.d(TAG, "commonChunked : $res")
        return res
    }

    fun commonPartition() {
        val (nums1, nums2) = myList.partition { e -> e < 0 }
        Log.d(TAG, "commonPartition : nums1 = $nums1, nums2 = $nums2")
        return
    }

    fun commonAny(): Boolean {
        val res = myList.any { e -> e < 0 }
        Log.d(TAG, "Any : $res")
        return res
    }

    fun commonAll(): Boolean {
        val res = myList.all { e -> e < 0 }
        Log.d(TAG, "All : $res")
        return res
    }
    fun commonDrop(): List<Int> {
        val elements = myList.drop(3)
        Log.d(TAG, "commonDrop : $elements")
        return elements
    }
    fun dropLast(): List<Int> {
        val elements = myList.dropLast(3)
        Log.d(TAG, "dropLast : $elements")
        return elements
    }
    fun commonTake(): List<String> {
        val elements = myMutableList.take(3)
        Log.d(TAG, "commonTake : $elements")
        return elements
    }
    fun takeLast(): List<String> {
        val elements = myMutableList.takeLast(3)
        Log.d(TAG, "takeLast : $elements")
        return elements
    }
}
