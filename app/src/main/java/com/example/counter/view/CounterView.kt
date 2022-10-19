package com.example.counter.view

interface CounterView {
    fun showNewCount(count: Int)
    fun color()
    fun toast(toastNumber: Int)
}