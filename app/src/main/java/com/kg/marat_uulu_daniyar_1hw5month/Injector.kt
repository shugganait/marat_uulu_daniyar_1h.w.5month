package com.kg.marat_uulu_daniyar_1hw5month

class Injector {

    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getModel(): Model {
            return Model()
        }
    }

}