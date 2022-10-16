package ar.edu.unlam.figuritas.ui.presentation.countries

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ar.edu.unlam.figuritas.databinding.ItemCountryCardBinding
import ar.edu.unlam.figuritas.domain.Country
import com.squareup.picasso.Picasso

class CountriesAdapter(
    private var countriesList: List<Country>
) : RecyclerView.Adapter<CountriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
        val itemBinding =
            ItemCountryCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CountriesViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
       val item = countriesList[position]
        holder.onBind(item)
    }

    override fun getItemCount() = countriesList.size

}

class CountriesViewHolder(private val binding: ItemCountryCardBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun onBind(item : Country){
        Picasso.get().load(item.image).into(binding.imgCountryFlag)
    }
}
