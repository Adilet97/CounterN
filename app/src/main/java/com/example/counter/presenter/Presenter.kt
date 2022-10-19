package com.example.counter.presenter

import com.example.counter.helper.Injector
import com.example.counter.view.CounterView

class Presenter {

    private val model = Injector.getModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.showNewCount(model.count)
        if (model.getCount() == model.getToastNumber()) {
            view.toast(model.getToastNumber())
        }
        if (model.getCount() == model.getChangeColor()) {
            view.color()
        }
    }

    fun decrement() {
        model.decrement()
        view.showNewCount(model.count)
        if (model.getCount() == model.getToastNumber()){
            view.toast(model.getToastNumber())
        }
        if (model.getCount() == model.getChangeColor()){
            view.color()
        } else if (model.getCount() != model.getChangeColor()){
            view.color()
        }
    }

    fun attachView(view: CounterView) {
        this.view = view
    }
}