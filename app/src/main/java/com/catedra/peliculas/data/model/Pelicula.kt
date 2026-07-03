package com.catedra.peliculas.data.model

/**
 * Modelo de dominio que representa una película.
 * Idéntico al Lab 2A — no modificar este archivo.
 */
data class Pelicula(
    val id: String,
    val titulo: String,
    val anio: Int,
    val genero: String,
    val descripcion: String,
    val director: String,
    val duracionMinutos: Int
)
