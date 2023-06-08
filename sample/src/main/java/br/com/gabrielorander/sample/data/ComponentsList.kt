package br.com.gabrielorander.sample.data

import androidx.fragment.app.Fragment
import br.com.gabrielorander.sample.presentation.loading_button.LoadingButtonFragment
import br.com.gabrielorander.sample.presentation.search_bar.SearchBarFragment

fun componentList(): List<Pair<String, Fragment>> = listOf(
    "Loading Button" to LoadingButtonFragment(),
    "Search" to SearchBarFragment(),
    "Tab" to SearchBarFragment(),
    "TextView" to SearchBarFragment()
)