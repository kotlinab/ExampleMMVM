package es.ipow.examplemmvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import es.ipow.examplemmvm.databinding.ActivityMainBinding
import es.ipow.examplemmvm.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var b : ActivityMainBinding

    //Conecto el ViewModel a nuestra Activity
    private val quoteViewModel : QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        // Me conecto a LiveData
        quoteViewModel.quoteModel.observe(this, Observer { currentCuote ->
            // Cuando LiveData "observe" un cambio (nueva cita). Hará lo siguiente
            b.tvQuote.text = currentCuote.quote
            b.tvAuthor.text = currentCuote.author
        })

        // Cada vez que hago click en el layout
        b.viewContainer.setOnClickListener {
            // Hago una llamada al ViewModel para que genere un QuoteModel nuevo
            quoteViewModel.randomQuote()
        }
    }
}