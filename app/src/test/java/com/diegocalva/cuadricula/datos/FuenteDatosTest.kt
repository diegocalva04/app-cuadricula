package com.diegocalva.cuadricula.datos

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class FuenteDatosTest {

    @Test
    fun `la fuente contiene veinticuatro temas`() {
        assertEquals(24, FuenteDatos.temas.size)
    }

    @Test
    fun `todos los temas tienen cursos e identificadores válidos`() {
        assertTrue(
            FuenteDatos.temas.all { tema ->
                tema.cursosDisponibles > 0 && tema.nombreRes != 0 && tema.imagenRes != 0
            }
        )
    }
}
