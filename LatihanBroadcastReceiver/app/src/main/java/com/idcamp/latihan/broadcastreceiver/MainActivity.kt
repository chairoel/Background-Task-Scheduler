package com.idcamp.latihan.broadcastreceiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.idcamp.latihan.broadcastreceiver.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.appBar?.toolbar)

        binding?.btnPermission?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}