package br.com.gabrielorander.barto.search_bar

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.gabrielorander.barto.databinding.SearchViewBinding

class SearchView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var binding: SearchViewBinding
    private var onQueryTextListener: OnQueryTextListener? = null

    init {
        binding = SearchViewBinding.inflate(LayoutInflater.from(context))
        configSearchListener()
        configOnClearListener()
    }

    private fun configSearchListener() {
        binding.searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                updateClearButtonVisibility()
                onQueryTextListener?.onQueryTextChange(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun updateClearButtonVisibility() {
        binding.apply {
            clearButton.visibility = if(searchEditText.text.isNotEmpty()) View.VISIBLE else View.INVISIBLE
        }
    }

    private fun configOnClearListener(){
        binding.apply {
            clearButton.setOnClickListener{
                searchEditText.text = null
                searchEditText.clearFocus()
                onQueryTextListener?.onQueryTextCleared()
            }
        }
    }

    fun setOnQueryTextListener(listener: OnQueryTextListener) {
        this.onQueryTextListener = listener
    }

    interface OnQueryTextListener {
        fun onQueryTextChange(query: String)
        fun onQueryTextCleared()
    }
}
