# Lab 2B — Lista de Películas (Jetpack Compose)

Proyecto base para el Lab 2B de la materia Aplicaciones Móviles.

> **Requisito:** haber completado el Lab 2A antes de arrancar este lab.

## Cómo abrir el proyecto

1. Abrir Android Studio
2. `File → Open → seleccionar esta carpeta`
3. Esperar a que Gradle sincronice las dependencias
4. Ejecutar con `Shift + F10` o el botón Run

## Archivos para completar

| Archivo | Etapa |
|---|---|
| `ui/peliculas/PeliculasScreen.kt` — función `PeliculaItem()` | Etapa 1 |
| `ui/peliculas/PeliculasUiState.kt` | Etapa 2 |
| `ui/peliculas/PeliculasViewModel.kt` | Etapa 3 |
| `ui/navigation/AppNavigation.kt` | Etapa 4 |

## Archivos de referencia (completos)

- `ui/detalle/DetalleScreen.kt` — ejemplo terminado: LaunchedEffect, estado local, Scaffold con TopAppBar
- `ui/peliculas/PeliculasScreen.kt` — `PeliculasScreen` y `PeliculasContenido` ya completos, solo falta `PeliculaItem`

## Consignas completas

Ver el documento `Lab2B_Compose.docx` en el repositorio de la cátedra.

## Diferencias respecto al Lab 2A

| Lab 2A (modelo tradicional) | Lab 2B (Compose) |
|---|---|
| item_pelicula.xml + PeliculaAdapter.kt | PeliculaItem() composable |
| Propiedades simples en ViewModel | StateFlow + UiState unificado |
| Observadores manuales en Fragment | collectAsStateWithLifecycle() |
| FragmentManager + beginTransaction() | navController.navigate() |
