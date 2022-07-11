package com.debora.projetotelaprodutos.model

data class Produto(
    val fotoproduto: Int,
    val nomeproduto: String,
    val valor: String,
    val quantidade: String,
    val validade: String,
    val referencia: String,
    val desconto: String,
    val combo: String
)
