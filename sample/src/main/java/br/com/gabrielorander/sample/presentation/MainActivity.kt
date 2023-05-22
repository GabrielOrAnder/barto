package br.com.gabrielorander.sample.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.gabrielorander.sample.data.getComponentList
import br.com.gabrielorander.sample.databinding.ActivityMainBinding
import br.com.gabrielorander.sample.presentation.adapter.ComponentListAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ComponentListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val components = getComponentList()
        adapter = ComponentListAdapter(components)

        binding.recycler.adapter = adapter
    }
}