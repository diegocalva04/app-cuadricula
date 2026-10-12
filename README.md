# Cuadrícula de temas

Aplicación Android que presenta veinticuatro áreas de aprendizaje en una cuadrícula vertical de dos columnas. Cada tarjeta combina una imagen, el nombre del tema y la cantidad de cursos disponibles.

## Características

- Interfaz creada con Jetpack Compose y Material 3.
- Cuadrícula desplazable mediante `LazyVerticalGrid`.
- Contenido y nombres del dominio en español.
- Compatibilidad desde Android 7.0, nivel de API 24.
- Identificador de aplicación `com.diegocalva.cuadricula`.

## Estructura principal

- `ActividadPrincipal.kt` inicia la interfaz y organiza la cuadrícula.
- `FuenteDatos.kt` reúne los veinticuatro temas mostrados.
- `Tema.kt` define la información de cada tarjeta.
- `ui/tema` contiene colores, tipografía y configuración visual.

## Compilación

El proyecto requiere JDK 17 y Android SDK 35. En Windows se valida con:

```powershell
.\gradlew.bat :app:assembleDebug
```

En Linux o macOS se utiliza:

```bash
./gradlew :app:assembleDebug
```

## Origen y licencias

Este proyecto adapta el código educativo disponible en [basic-android-kotlin-compose-training-courses](https://github.com/google-developer-training/basic-android-kotlin-compose-training-courses). El código de origen se distribuye con licencia Apache 2.0; la licencia y los avisos de derechos se conservan en este repositorio.

La adaptación realizada por Diego Calva cambia el paquete, la identidad visual, los nombres del dominio, la interfaz en español y la documentación del proyecto.

Las fotografías pertenecen a Romain Guy y se publicaron bajo [CC0 1.0 Universal](https://creativecommons.org/publicdomain/zero/1.0/).
