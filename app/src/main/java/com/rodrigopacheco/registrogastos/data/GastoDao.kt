package com.rodrigopacheco.registrogastos.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface GastoDao {

    @Insert
    suspend fun insertarGasto(gasto: Gasto)

    @Query("SELECT * FROM gastos ORDER BY fecha DESC")
    fun obtenerTodosLosGastos(): Flow<List<Gasto>>

    @Query("SELECT SUM(monto) FROM gastos")
    fun obtenerTotalGastos(): Flow<Double?>

    @Delete
    suspend fun eliminarGasto(gasto: Gasto)

    @Query("DELETE FROM gastos")
    suspend fun eliminarTodosLosGastos()
}