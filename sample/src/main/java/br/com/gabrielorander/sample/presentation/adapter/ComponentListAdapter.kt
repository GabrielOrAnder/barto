package br.com.gabrielorander.sample.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import br.com.gabrielorander.sample.databinding.ComponentListItemBinding
import br.com.gabrielorander.sample.presentation.viewholder.ComponentListViewHolder

class ComponentListAdapter(
    private val components: List<Pair<String, Fragment>>,
    private val onComponentListClick: (Fragment) -> Unit
): RecyclerView.Adapter<ComponentListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComponentListViewHolder {
        return ComponentListViewHolder(
            ComponentListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onComponentListClick
        )
    }

    override fun getItemCount() = components.size

    override fun onBindViewHolder(holder: ComponentListViewHolder, position: Int) {
        holder.bind(components[position])
    }
}
