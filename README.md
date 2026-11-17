# Zooilógico — Curso 2026/2027

Proyecto de iniciación a la **herencia y al polimorfismo en Java**, utilizado en las prácticas de Programación de 1.º de DAM/DAW. El zoológico es un poco ilógico: cada animal muestra comportamientos elegidos aleatoriamente.

## Contenido inicial

El proyecto parte únicamente de estas cinco clases, situadas en `src/Zoo/`:

- `Animal`: clase base de los animales.
- `Anfibio`: clase que hereda de `Animal`.
- `Rana` y `Salamandra`: ejemplos de clases que heredan de `Anfibio`.
- `Main`: punto de entrada de la aplicación.

Al ejecutar el programa se presenta el Zooilógico y se observan **tres acciones de una rana y tres de una salamandra**. Las acciones se seleccionan aleatoriamente, por lo que pueden variar entre ejecuciones.

## Requisitos

- Un **JDK** instalado (se recomienda JDK 21).
- **IntelliJ IDEA Community Edition** (u otro entorno compatible con Java).
- **Git**, si se va a clonar el repositorio.

No se necesitan bibliotecas externas, Maven ni Gradle.

## Clonar y abrir en IntelliJ IDEA

1. En GitHub, abre este repositorio y copia su dirección desde **Code → HTTPS**.
2. En IntelliJ IDEA, elige **Get from VCS** (o **File → New → Project from Version Control**).
3. Pega la URL del repositorio, elige la carpeta de destino y pulsa **Clone**.
4. Comprueba que IntelliJ ha detectado un JDK. Si no lo ha hecho, configúralo en **File → Project Structure → Project → SDK**.
5. Si es necesario, marca `src` como carpeta de código fuente: clic derecho sobre `src` → **Mark Directory as → Sources Root**.
6. Abre `src/Zoo/Main.java` y pulsa el botón verde de ejecución situado junto a `main`.

También puedes descargar el ZIP desde GitHub, descomprimirlo y abrir la carpeta en IntelliJ, aunque **clonarlo es lo recomendable para practicar Git**.

## Ejecutar desde la terminal (opcional)

Desde la raíz del proyecto, con un JDK instalado:

```bash
javac -d out src/Zoo/*.java
java -cp out Zoo.Main
```

La carpeta `out/` contiene archivos generados durante la compilación y está excluida de Git.

## Trabajo con Git

Una vez clonado el repositorio, puedes consultar los cambios con `git status`, preparar archivos con `git add`, registrar versiones con `git commit` y subirlas con `git push` (si tienes permisos de escritura sobre el repositorio remoto).

> **Importante:** el `.gitignore` evita subir archivos compilados, configuraciones locales del IDE y archivos temporales. No sustituye a revisar qué archivos se van a incluir en cada commit.
