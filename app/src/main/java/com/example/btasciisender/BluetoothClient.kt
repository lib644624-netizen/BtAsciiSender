package com.example.btasciisender

import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import java.io.OutputStream
import java.util.UUID

class BluetoothClient {

    private val uuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB")
    private var socket: BluetoothSocket? = null
    private var outputStream: OutputStream? = null

    fun connect(device: BluetoothDevice): Boolean {
        return try {
            socket = device.createRfcommSocketToServiceRecord(uuid)
            socket?.connect()
            outputStream = socket?.outputStream
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    fun sendAscii(text: String) {
        outputStream?.write(text.toByteArray(Charsets.US_ASCII))
        outputStream?.flush()
    }

    fun close() {
        socket?.close()
    }
}
