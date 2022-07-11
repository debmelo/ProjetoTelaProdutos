package com.debora.projetotelaprodutos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.debora.projetotelaprodutos.adapter.AdapterProduto
import com.debora.projetotelaprodutos.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerView_produtos)
        recyclerView_produtos.layoutManager = LinearLayoutManager(this)

        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this,listaProdutos )
        recyclerView_produtos.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.arroz,
            nomeproduto = "Arroz",
            quantidade = "Qnt: 1kg",
            valor = "R$ 10,00",
            validade = "Val: 10/05/2023",
            referencia = "Ref. 101",
            desconto =  "5% de desconto",
            combo = "Leve 2 por R$18,00"


        )
        val produto2 = Produto(
            R.drawable.feijao,
            nomeproduto = "Feijão",
            quantidade = "Qnt: 1kg",
            valor = "R$ 20,00",
            validade = "Val: 07/12/2023",
            referencia = "Ref. 102",
            desconto =  "2% de desconto",
            combo = "Leve 2 por R$35,00"
        )

        val produto3 = Produto(
            R.drawable.macarrao,
            nomeproduto = "Macarrão",
            quantidade = "Qnt: 500g",
            valor = "R$ 4,00",
            validade = "Val: 02/08/2022",
            referencia = "Ref. 103",
            desconto =  "10% de desconto",
            combo = "Leve 3 por R$10,00"
        )


        listaProdutos.add(produto1)
        listaProdutos.add(produto2)
        listaProdutos.add(produto3)




    }
}