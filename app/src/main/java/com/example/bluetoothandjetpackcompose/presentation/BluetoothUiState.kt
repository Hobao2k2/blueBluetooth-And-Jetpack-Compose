package com.example.bluetoothandjetpackcompose.presentation

import com.example.bluetoothandjetpackcompose.domain.chat.BluetoothDevice


data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
)