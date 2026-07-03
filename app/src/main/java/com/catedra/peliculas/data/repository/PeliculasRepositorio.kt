package com.catedra.peliculas.data.repository

import com.catedra.peliculas.data.model.Pelicula
import kotlinx.coroutines.delay

/**
 * Repositorio de películas.
 * En una app real, esta clase haría llamadas a una API o base de datos.
 * Para este lab, devuelve datos hardcodeados con un delay simulado de red.
 * No modificar este archivo.
 */
class PeliculasRepositorio {

    suspend fun obtenerPeliculas(): List<Pelicula> {
        // Simulamos latencia de red de 1 segundo
        delay(1000)
        return PELICULAS
    }

    suspend fun obtenerPelicula(id: String): Pelicula? {
        delay(500)
        return PELICULAS.find { it.id == id }
    }

    companion object {
        private val PELICULAS = listOf(
            Pelicula(
                id = "1",
                titulo = "Inception",
                anio = 2010,
                genero = "Ciencia ficción",
                descripcion = "Un ladrón que roba secretos corporativos a través del uso de la tecnología de compartir sueños recibe la tarea inversa de plantar una idea en la mente de un CEO.",
                director = "Christopher Nolan",
                duracionMinutos = 148
            ),
            Pelicula(
                id = "2",
                titulo = "The Godfather",
                anio = 1972,
                genero = "Drama",
                descripcion = "El envejecido patriarca de una dinastía del crimen organizado transfiere el control de su imperio clandestino a su renuente hijo.",
                director = "Francis Ford Coppola",
                duracionMinutos = 175
            ),
            Pelicula(
                id = "3",
                titulo = "Interstellar",
                anio = 2014,
                genero = "Ciencia ficción",
                descripcion = "Un equipo de exploradores viaja a través de un agujero de gusano en el espacio en un intento de asegurar la supervivencia de la humanidad.",
                director = "Christopher Nolan",
                duracionMinutos = 169
            ),
            Pelicula(
                id = "4",
                titulo = "Pulp Fiction",
                anio = 1994,
                genero = "Crimen",
                descripcion = "Las vidas de dos sicarios, un boxeador, una esposa de gángster y un par de bandidos se entrelazan en cuatro historias de violencia y redención.",
                director = "Quentin Tarantino",
                duracionMinutos = 154
            ),
            Pelicula(
                id = "5",
                titulo = "The Dark Knight",
                anio = 2008,
                genero = "Acción",
                descripcion = "Cuando el Joker emerge del anonimato y desata el caos en Gotham City, Batman debe enfrentarse a uno de los mayores desafíos psicológicos y físicos de su carrera.",
                director = "Christopher Nolan",
                duracionMinutos = 152
            ),
            Pelicula(
                id = "6",
                titulo = "Schindler's List",
                anio = 1993,
                genero = "Drama histórico",
                descripcion = "En la Polonia ocupada por los alemanes durante la Segunda Guerra Mundial, Oskar Schindler gradualmente se preocupa por sus trabajadores judíos.",
                director = "Steven Spielberg",
                duracionMinutos = 195
            ),
            Pelicula(
                id = "7",
                titulo = "The Matrix",
                anio = 1999,
                genero = "Ciencia ficción",
                descripcion = "Un programador informático descubre que la realidad que conoce es una simulación creada por máquinas, y se une a una rebelión contra ellas.",
                director = "The Wachowskis",
                duracionMinutos = 136
            ),
            Pelicula(
                id = "8",
                titulo = "Parasite",
                anio = 2019,
                genero = "Drama",
                descripcion = "La codicia y la discriminación de clase amenazan la relación simbiótica entre la adinerada familia Park y la empobrecida familia Kim.",
                director = "Bong Joon-ho",
                duracionMinutos = 132
            ),
            Pelicula(
                id = "9",
                titulo = "Forrest Gump",
                anio = 1994,
                genero = "Drama",
                descripcion = "Las presidencias de Kennedy y Johnson, los eventos de Vietnam, Watergate y otros eventos históricos se desarrollan desde la perspectiva de un hombre de Alabama con un coeficiente intelectual bajo.",
                director = "Robert Zemeckis",
                duracionMinutos = 142
            ),
            Pelicula(
                id = "10",
                titulo = "La La Land",
                anio = 2016,
                genero = "Musical",
                descripcion = "Mientras el jazz está en declive, un músico y una actriz en ciernes se enamoran en Los Ángeles mientras persiguen sus sueños.",
                director = "Damien Chazelle",
                duracionMinutos = 128
            )
        )
    }
}
