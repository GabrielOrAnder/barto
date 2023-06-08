package br.com.gabrielorander.sample.presentation.loading_button

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielorander.sample.databinding.FragmentLoadingButtonBinding

class LoadingButtonFragment : Fragment() {

    private lateinit var binding: FragmentLoadingButtonBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoadingButtonBinding.inflate(inflater, container, false)
        return binding.root
    }

}