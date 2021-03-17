package com.example.adblogcatview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adblogcatview.databinding.ActivityMainBinding
import com.mysafe.msmealorder_public.util.log.SaveLogUtil
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.lang.Thread.sleep
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var dataBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        Log.i(TAG, "onCreate: asfasf")
        dataBinding.btnLOG.setOnClickListener {
            val path: String = getExternalFilesDir("log").toString()
            val packageName: String = packageName
            SaveLogUtil.instance?.saveLogFile(path, packageName)
        }
    }
}