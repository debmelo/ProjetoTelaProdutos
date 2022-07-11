package com.debora.projetotelaprodutos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.debora.projetotelaprodutos.R
import com.debora.projetotelaprodutos.model.Produto

class AdapterProduto (private val context: Context, private val produtos: MutableList<Produto> ): RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {

    inner class ProdutoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val fotoproduto = itemView.findViewById<ImageView>(R.id.fotoproduto)
        val nomeproduto = itemView.findViewById<TextView>(R.id.nomeproduto)
        val quantidade = itemView.findViewById<TextView>(R.id.quantidade)
        val valor = itemView.findViewById<TextView>(R.id.valor)
        val validade = itemView.findViewById<TextView>(R.id.validade)
        val referencia = itemView.findViewById<TextView>(R.id.referencia)
        val desconto = itemView.findViewById<TextView>(R.id.desconto)
        val combo = itemView.findViewById<TextView>(R.id.combo)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.mercearia_item, parent, false)
        val holder = ProdutoViewHolder(itemLista)
        return  holder
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.fotoproduto.setImageResource(produtos[position].fotoproduto)
        holder.nomeproduto.text = produtos[position].nomeproduto
        holder.quantidade.text = produtos[position].quantidade
        holder.valor.text = produtos[position].valor
        holder.validade.text = produtos[position].validade
        holder.referencia.text = produtos[position].referencia
        holder.desconto.text = produtos[position].desconto
        holder.combo.text = produtos[position].combo

    }

    override fun getItemCount(): Int = produtos.size


}