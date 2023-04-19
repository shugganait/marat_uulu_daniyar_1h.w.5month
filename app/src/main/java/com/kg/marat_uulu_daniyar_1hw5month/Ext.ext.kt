package com.kg.marat_uulu_daniyar_1hw5month

import android.app.Activity
import android.content.Context
import android.widget.Toast

fun Activity.showToast(msg: String) {
    Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
}