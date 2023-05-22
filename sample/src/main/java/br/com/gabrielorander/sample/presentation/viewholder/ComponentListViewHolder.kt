package br.com.gabrielorander.sample.presentation.viewholder

import androidx.recyclerview.widget.RecyclerView
import br.com.gabrielorander.sample.databinding.ComponentListItemBinding

class ComponentListViewHolder(
    private val binding: ComponentListItemBinding
): RecyclerView.ViewHolder(binding.root) {

    fun bindView(componentName: String){
        binding.componentName.text = componentName
    }
}