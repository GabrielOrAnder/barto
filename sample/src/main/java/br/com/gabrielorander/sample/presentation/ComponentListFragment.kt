package br.com.gabrielorander.sample.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielorander.sample.R
import br.com.gabrielorander.sample.data.componentList
import br.com.gabrielorander.sample.databinding.FragmentComponentListBinding
import br.com.gabrielorander.sample.presentation.adapter.ComponentListAdapter

class ComponentListFragment : Fragment() {

    private lateinit var binding: FragmentComponentListBinding
    private lateinit var adapter: ComponentListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentComponentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
    }

    private fun setupAdapter() {
        val components = componentList()
        adapter = ComponentListAdapter(components) { fragment ->
            navigateTo(fragment)
        }
        binding.recycler.adapter = adapter
    }

    private fun navigateTo(fragment: Fragment) {
        val fragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.navHostFragment, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

}