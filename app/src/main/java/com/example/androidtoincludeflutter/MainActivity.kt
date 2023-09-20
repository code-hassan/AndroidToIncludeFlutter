package com.example.androidtoincludeflutter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.androidtoincludeflutter.databinding.ActivityMainBinding
import io.flutter.embedding.android.FlutterActivity;

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.button.setOnClickListener {
            startActivity(
                FlutterActivity.createDefaultIntent(this)
            )
        }


    }
}