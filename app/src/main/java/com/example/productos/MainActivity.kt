package com.example.productos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.productos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productList = listOf(
            Product("Manzanas", "Frutas", 2.99),
            Product("Leche", "Lácteos", 1.49),
            Product("Pan", "Panadería", 2.49),
            Product("Jugo de Naranja", "Bebidas", 3.99),
            Product("Queso", "Lácteos", 4.99),
            Product("Yogur", "Lácteos", 0.99),
            Product("Carne de Res", "Carnes", 8.99),
            Product("Pollo", "Carnes", 5.99),
            Product("Papas", "Vegetales", 1.99),
            Product("Tomates", "Vegetales", 1.29)
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = ProductAdapter(productList)
    }
}
