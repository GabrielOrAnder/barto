package br.com.gabrielorander.sample.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.gabrielorander.sample.databinding.ComponentListItemBinding
import br.com.gabrielorander.sample.presentation.viewholder.ComponentListViewHolder

class ComponentListAdapter(
    private val components: List<String>
): RecyclerView.Adapter<ComponentListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComponentListViewHolder {
        return ComponentListViewHolder(
            ComponentListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = components.size

    override fun onBindViewHolder(holder: ComponentListViewHolder, position: Int) {
        holder.bindView(components[position])
    }
}