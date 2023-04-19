package com.kg.marat_uulu_daniyar_1hw5month

class Presenter {

    private var model = Injector.getModel()
    private lateinit var view: CounterView

    fun increment() {
        model.increment()
        if(model.count == 15) {
            view.changeColor()
            view.showCount(model.count)
        }else if (model.count == 10) {
            view.showCongratulation()
            view.showCount(model.count)
        }
        view.showCount(model.count)

    }
    fun decrement() {
        model.decrement()
        if(model.count == 10) {
            view.showCongratulation()
            view.showCount(model.count)
        }
        view.showCount(model.count)
    }

    fun attachView(viewFromActivivty: CounterView) {
        view = viewFromActivivty
    }
}