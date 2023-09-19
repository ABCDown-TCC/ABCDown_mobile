package br.senai.sp.jandira.abcdown_mobile.model

data class Responsible (
    val nome: String,
    val cpf :String,
    val data_nascimento: String,
    val foto: String,
    val email: String,
    val senha: String,
    val id_genero: Int,
    val numero: String,
    val cep: String,
    val numero_telefone: String
)