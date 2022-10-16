package ar.edu.unlam.figuritas.ui.presentation.countries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import ar.edu.unlam.figuritas.databinding.ActivityCountriesBinding
import ar.edu.unlam.figuritas.domain.Country

class CountriesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountriesBinding
    private lateinit var adapter: CountriesAdapter
    private val  countriesList : List<Country> = listOf(
        Country("https://www.protocolo.org/extfiles/i-8154-cG.22202.1.jpg"),
        Country("https://www.protocolo.org/extfiles/i-8154-cG.22202.1.jpg"),
        Country("https://www.protocolo.org/extfiles/i-8154-cG.22202.1.jpg"),
        Country("https://www.protocolo.org/extfiles/i-8154-cG.22202.1.jpg"),
        Country("https://www.protocolo.org/extfiles/i-8154-cG.22202.1.jpg"),
        Country("https://www.protocolo.org/extfiles/i-8154-cG.22202.1.jpg"),
        Country("https://www.protocolo.org/extfiles/i-8154-cG.22202.1.jpg"),
        Country("https://www.protocolo.org/extfiles/i-8154-cG.22202.1.jpg"),
        Country("https://www.protocolo.org/extfiles/i-8154-cG.22202.1.jpg"),

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()

    }

    private fun initRecyclerView(){
        binding.rv.layoutManager  = GridLayoutManager(this,3)
        adapter = CountriesAdapter(countriesList)
        binding.rv.adapter = adapter

    }
}