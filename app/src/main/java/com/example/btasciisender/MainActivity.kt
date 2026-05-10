package com.example.btasciisender

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btasciisender.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val client = BluetoothClient()
    private val adapter = BluetoothAdapter.getDefaultAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConnect.setOnClickListener {
            val device: BluetoothDevice? =
                adapter.bondedDevices.firstOrNull()
            device?.let {
                client.connect(it)
                binding.status.text = "已连接：${it.name}"
            }
        }

        binding.btnSend.setOnClickListener {
            val text = binding.input.text.toString()
            client.sendAscii(text)
        }
    }
}
