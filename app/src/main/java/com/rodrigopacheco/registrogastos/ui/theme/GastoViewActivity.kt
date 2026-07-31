package com.rodrigopacheco.registrogastos.ui.theme

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.rodrigopacheco.registrogastos.data.Gasto
import com.rodrigopacheco.registrogastos.data.GastosDatabase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class GastoViewModel(application: Application) : AndroidViewModel(application) {

    private val gastoDao = GastosDatabase.getDatabase(application).gastoDao()

    val todosLosGastos: Flow<List<Gasto>> = gastoDao.obtenerTodosLosGastos()
    val totalGastos: Flow<Double?> = gastoDao.obtenerTotalGastos()

    fun insertarGasto(descripcion: String, monto: Double) {
        viewModelScope.launch {
            val gasto = Gasto(
                descripcion = descripcion,
                monto = monto
            )
            gastoDao.insertarGasto(gasto)
        }
    }

    fun eliminarGasto(gasto: Gasto) {
        viewModelScope.launch {
            gastoDao.eliminarGasto(gasto)
        }
    }

    fun eliminarTodos() {
        viewModelScope.launch {
            gastoDao.eliminarTodosLosGastos()
        }
    }
}

