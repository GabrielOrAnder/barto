package br.com.gabrielorander.sample.presentation.search_bar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielorander.sample.databinding.FragmentSearchBarBinding

class SearchBarFragment : Fragment() {

    private lateinit var binding: FragmentSearchBarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBarBinding.inflate(LayoutInflater.from(context))
        return binding.root
    }

}