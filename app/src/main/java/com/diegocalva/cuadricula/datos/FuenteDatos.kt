/*
 * Copyright (C) 2023 The Android Open Source Project
 * Modificado en 2026 por Diego Calva para localizar los datos de la cuadrícula.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.diegocalva.cuadricula.datos

import com.diegocalva.cuadricula.R
import com.diegocalva.cuadricula.modelo.Tema

object FuenteDatos {
    val temas = listOf(
        Tema(R.string.arquitectura, 58, R.drawable.architecture),
        Tema(R.string.automoviles, 30, R.drawable.automotive),
        Tema(R.string.biologia, 90, R.drawable.biology),
        Tema(R.string.artesania, 121, R.drawable.crafts),
        Tema(R.string.negocios, 78, R.drawable.business),
        Tema(R.string.cocina, 118, R.drawable.culinary),
        Tema(R.string.diseno, 423, R.drawable.design),
        Tema(R.string.ecologia, 28, R.drawable.ecology),
        Tema(R.string.ingenieria, 67, R.drawable.engineering),
        Tema(R.string.moda, 92, R.drawable.fashion),
        Tema(R.string.finanzas, 100, R.drawable.finance),
        Tema(R.string.cine, 165, R.drawable.film),
        Tema(R.string.videojuegos, 37, R.drawable.gaming),
        Tema(R.string.geologia, 290, R.drawable.geology),
        Tema(R.string.dibujo, 326, R.drawable.drawing),
        Tema(R.string.historia, 189, R.drawable.history),
        Tema(R.string.periodismo, 96, R.drawable.journalism),
        Tema(R.string.derecho, 58, R.drawable.law),
        Tema(R.string.estilo_vida, 305, R.drawable.lifestyle),
        Tema(R.string.musica, 212, R.drawable.music),
        Tema(R.string.pintura, 172, R.drawable.painting),
        Tema(R.string.fotografia, 321, R.drawable.photography),
        Tema(R.string.fisica, 41, R.drawable.physics),
        Tema(R.string.tecnologia, 118, R.drawable.tech),
    )
}
