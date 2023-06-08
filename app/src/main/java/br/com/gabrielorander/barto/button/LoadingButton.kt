package br.com.gabrielorander.barto.button

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import br.com.gabrielorander.barto.databinding.LoadingButtonBinding

class LoadingButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr){

    private var binding: LoadingButtonBinding

    init {
        binding = LoadingButtonBinding.inflate(LayoutInflater.from(context))
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

    fun setTextColor(color: Int) {
        binding.textButton.setTextColor(color)
    }
}