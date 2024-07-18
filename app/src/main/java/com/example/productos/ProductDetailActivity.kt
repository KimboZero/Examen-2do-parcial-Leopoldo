package com.example.productos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.productos.databinding.ActivityProductDetailBinding

class ProductDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val product = intent.getParcelableExtra<Product>("product")

        product?.let {
            binding.productName.text = it.name
            binding.productType.text = it.type
            binding.productCost.text = it.cost.toString()
        }
    }
}
