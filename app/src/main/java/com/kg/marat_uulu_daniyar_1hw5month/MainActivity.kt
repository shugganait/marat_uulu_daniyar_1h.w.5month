package com.kg.marat_uulu_daniyar_1hw5month

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kg.marat_uulu_daniyar_1hw5month.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private var count = 0
    private var presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ////////////////////////////
        clickListener()
        presenter.attachView(this)
    }

    private fun clickListener() {
        binding.apply {
            incrementBtn.setOnClickListener {
                presenter.increment()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.countTv.text = count.toString()
    }

    override fun changeColor() {
        binding.countTv.setTextColor(Color.GREEN)
    }

    override fun showCongratulation() {
        showToast("Поздравляю")
    }
}