package br.com.gabrielorander.barto.loading_button

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.core.view.isVisible
import br.com.gabrielorander.barto.R
import br.com.gabrielorander.barto.databinding.ViewLoadingButtonBinding

class LoadingButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr){

    private var binding: ViewLoadingButtonBinding

    init {
        binding = ViewLoadingButtonBinding.inflate(LayoutInflater.from(context))
        //addView(binding.root)
    }

    fun showLoading() {
        binding.loadingButton.visibility = View.VISIBLE
        binding.textButton.visibility = View.GONE
    }

    fun hideLoading() {
        binding.loadingButton.visibility = View.GONE
        binding.textButton.visibility = View.VISIBLE
    }

    fun setText(text: String) {
        binding.textButton.text = text
    }
}
