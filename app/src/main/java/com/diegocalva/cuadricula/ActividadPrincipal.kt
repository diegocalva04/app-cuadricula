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
package com.diegocalva.cuadricula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.diegocalva.cuadricula.datos.FuenteDatos
import com.diegocalva.cuadricula.modelo.Tema
import com.diegocalva.cuadricula.ui.tema.TemaCuadricula

class ActividadPrincipal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            TemaCuadricula {
                // El contenedor usa el color de fondo definido por el tema visual.
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadriculaTemas(
                        modifier = Modifier.padding(
                            start = dimensionResource(R.dimen.espaciado_pequeno),
                            top = dimensionResource(R.dimen.espaciado_pequeno),
                            end = dimensionResource(R.dimen.espaciado_pequeno),
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun CuadriculaTemas(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.espaciado_pequeno)),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.espaciado_pequeno)),
        modifier = modifier
    ) {
        items(FuenteDatos.temas) { tema ->
            TarjetaTema(tema)
        }
    }
}

@Composable
fun TarjetaTema(tema: Tema, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Row {
            Image(
                painter = painterResource(id = tema.imagenRes),
                contentDescription = null,
                modifier = Modifier
                    .size(width = 68.dp, height = 68.dp)
                    .aspectRatio(1f),
                contentScale = ContentScale.Crop
            )

            Column {
                Text(
                    text = stringResource(id = tema.nombreRes),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(
                        start = dimensionResource(R.dimen.espaciado_medio),
                        top = dimensionResource(R.dimen.espaciado_medio),
                        end = dimensionResource(R.dimen.espaciado_medio),
                        bottom = dimensionResource(R.dimen.espaciado_pequeno)
                    )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.ic_grain),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = dimensionResource(R.dimen.espaciado_medio))
                    )
                    Text(
                        text = tema.cursosDisponibles.toString(),
                        style = MaterialTheme.typography.labelMedium,
                        modifier = Modifier.padding(start = dimensionResource(R.dimen.espaciado_pequeno))
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaTema() {
    TemaCuadricula {
        val tema = Tema(R.string.fotografia, 321, R.drawable.photography)
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TarjetaTema(tema = tema)
        }
    }
}
