package viewModel

import Model.resultComparar
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class resultCompararViewModel: ViewModel() {
    private val comparacion = MutableLiveData<resultComparar>()
    val comparar: LiveData<resultComparar> = comparacion

    fun compararCadenas(cadena1:String,cadena2:String){
        val resultado = if(cadena1 == cadena2) "Cadenas Iguales" else "Cadenas No Iguales"
        comparacion.value = resultComparar(resultado)
    }
}