/*
 * Copyright (C) 2023 The Android Open Source Project
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
package com.diegocalva.cuadricula.ui.tema

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val EsquemaOscuro = darkColorScheme(
    primary = PrimarioOscuro,
    secondary = SecundarioOscuro,
    tertiary = TerciarioOscuro
)

private val EsquemaClaro = lightColorScheme(
    primary = PrimarioClaro,
    secondary = SecundarioClaro,
    tertiary = TerciarioClaro
)

@Composable
fun TemaCuadricula(
    temaOscuro: Boolean = isSystemInDarkTheme(),
    // El color dinámico está disponible desde Android 12.
    colorDinamico: Boolean = false,
    contenido: @Composable () -> Unit
) {
    val esquemaColor = when {
        colorDinamico && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val contexto = LocalContext.current
            if (temaOscuro) dynamicDarkColorScheme(contexto) else dynamicLightColorScheme(contexto)
        }

        temaOscuro -> EsquemaOscuro
        else -> EsquemaClaro
    }
    MaterialTheme(
        colorScheme = esquemaColor,
        typography = Tipografia,
        content = contenido
    )
}
