package br.com.gabrielorander.sample.presentation.viewholder

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import br.com.gabrielorander.sample.databinding.ComponentListItemBinding

class ComponentListViewHolder(
    private val binding: ComponentListItemBinding,
    private val onComponentListClick: (Fragment) -> Unit
): RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Pair<String, Fragment>){
        bindView(item.first)
        bindAction(item.second)
    }

    private fun bindView(componentName: String){
        binding.componentName.text = componentName
    }

    private fun bindAction(fragment: Fragment) {
        binding.apply {
            root.setOnClickListener {
                onComponentListClick(fragment)
            }
        }
    }
}