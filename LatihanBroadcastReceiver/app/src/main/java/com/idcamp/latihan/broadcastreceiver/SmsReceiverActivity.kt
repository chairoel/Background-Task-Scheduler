package com.idcamp.latihan.broadcastreceiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idcamp.latihan.broadcastreceiver.databinding.ActivitySmsReceiverBinding

class SmsReceiverActivity : AppCompatActivity() {
    private var _binding: ActivitySmsReceiverBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySmsReceiverBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.appBar?.toolbar)

        title = getString(R.string.incoming_message)

        binding?.btnClose?.setOnClickListener {
            finish()
        }

        val senderNo = intent.getStringExtra(EXTRA_SMS_NO)
        val senderMessage = intent.getStringExtra(EXTRA_SMS_MESSAGE)

        binding?.tvFrom?.text = getString(R.string.from, senderNo)
        binding?.tvMessage?.text = senderMessage

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        const val EXTRA_SMS_NO = "extra_sms_no"
        const val EXTRA_SMS_MESSAGE = "extra_sms_message"
    }
}