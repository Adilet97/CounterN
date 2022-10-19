package com.example.counter.model

class CounterModel {
    var count = 0
    private var toastNumber = 10
    private var changeColor = 15


    fun getToastNumber(): Int {
        return toastNumber
    }
    fun getChangeColor(): Int {
        return changeColor
    }

    fun increment (){
        ++count
    }

    fun decrement() {
        count--
    }
    @JvmName("getCount1")
    fun getCount(): Int{
        return count
    }

}