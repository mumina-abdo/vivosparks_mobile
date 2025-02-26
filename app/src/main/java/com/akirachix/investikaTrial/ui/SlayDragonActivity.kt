package com.akirachix.investikaTrial.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.investikatrial.databinding.ActivitySlayDragonBinding

class SlayDragonActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySlayDragonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySlayDragonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, LowMidRiskActivity::class.java)
            startActivity(intent)
        }
    }
}