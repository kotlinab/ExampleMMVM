package es.ipow.examplemmvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import es.ipow.examplemmvm.model.QuoteModel
import es.ipow.examplemmvm.model.QuoteProvider

class QuoteViewModel : ViewModel() {
    // Creo una variable LiveData para monitorizar cambios
    val quoteModel = MutableLiveData<QuoteModel>()

    // Cuando llame a esta función modificaré el elemento QuoteModel
    fun randomQuote (){
        // Obtengo un nuevo elemento QuoteModel
        val currentQuote:QuoteModel = QuoteProvider.random()
        // Y modifico el que tiene el LiveData
        quoteModel.postValue(currentQuote)
    }
}