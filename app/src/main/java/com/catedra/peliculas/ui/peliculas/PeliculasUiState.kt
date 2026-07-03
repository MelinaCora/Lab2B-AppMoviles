package com.catedra.peliculas.ui.peliculas

import com.catedra.peliculas.data.model.Pelicula

/**
 * Estado completo de la pantalla de listado de películas.
 *
 * ETAPA 2 DEL LAB: completar los campos y la propiedad calculada.
 *
 * Comparación con el Lab 2A:
 * En el ViewModel del Lab 2A tenías tres propiedades separadas (peliculas, cargando, error)
 * y una cuarta (peliculasFiltradas) que actualizabas manualmente en dos funciones distintas.
 * Acá esas cuatro piezas viven juntas en una única data class, y peliculasFiltradas
 * se calcula automáticamente — siempre es consistente con peliculas y consulta
 * sin ningún código de sincronización adicional.
 */
data class PeliculasUiState(

    // TODO Etapa 2a: agregar los siguientes campos con sus valores por defecto:
    //
    // peliculas     : List<Pelicula>  → vacía por defecto    (emptyList())
    // consulta      : String          → vacío por defecto     ("")
    // cargando      : Boolean         → true por defecto
    // error         : String?         → null por defecto
    //
    // Ejemplo de cómo declarar un campo con valor por defecto en una data class:
    //   val nombreCampo: Tipo = valorPorDefecto

) {

    /**
     * Lista filtrada según la consulta actual.
     *
     * TODO Etapa 2b: implementar esta propiedad calculada.
     * Debe devolver:
     * - Todas las películas si la consulta está vacía (consulta.isBlank())
     * - Las películas cuyo título contiene la consulta, sin distinguir mayúsculas
     *   (usar String.contains(other, ignoreCase = true))
     *
     * Esta propiedad NO es un campo: se recalcula automáticamente cada vez que
     * se accede a ella. No necesitás actualizarla manualmente en ningún lado.
     */
    val peliculasFiltradas: List<Pelicula>
        get() = TODO("Implementar: devolver peliculas filtradas según consulta")
}
