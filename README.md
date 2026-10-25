# Kata 1 - Entorno y flujo de trabajo

Este es el repositorio de la primera Kata de Ingeniería de Software II. El objetivo principal no era hacer un programa complejo, sino coger soltura con IntelliJ IDEA, Git y GitHub mediante repetición.

## ¿Qué incluye el proyecto?
* **Java:** He creado unas clases básicas (como `Person` y `Main`). La idea ha sido usar `record` para hacerlas inmutables, añadir constructores, métodos de cálculo de edad y sobreescribir el `toString()`. También he usado la API `java.time`.
* **Configuración Maven (`pom.xml`):** Tuve que ajustar las propiedades del compilador para que usara explícitamente Java 26 (`maven.compiler.source` y `target` en 26), ya que me estaba dando problemas de compatibilidad con versiones superiores (target 27).
* **Limpieza (`.gitignore`):** Configuré el archivo para no subir archivos indeseados al repositorio. He ignorado las carpetas generadas al compilar (`target/` y `out/`), además de archivos binarios y comprimidos (`*.class`, `*.jar`, `*.zip`).

## Repetición y ramas (Git / GitHub)
Para cumplir con la "repetición deliberada", he hecho el ejercicio tres veces desde cero:
1. Creé el repositorio en GitHub vacío y lo vinculé a mi proyecto local.
2. Dejé una base limpia en la rama `master`.
3. Fui creando ramas independientes (`develop1`, `develop2`, `develop3`), asegurándome de usar `git checkout master` antes de crear cada una para no arrastrar el código del intento anterior.
4. Al final, hice un merge de mi mejor repetición (`develop3`) hacia `master` y subí todo con `git push --all origin`.

## Atajos de teclado que he practicado
Durante el desarrollo he intentado depender lo mínimo del ratón. Los atajos que he usado han sido:
* **`Ctrl + D`:** Para duplicar la línea actual rápidamente justo debajo.
* **`Ctrl + Alt + F`:** Para extraer un valor a un atributo de clase directamente como `private final`.
* **`Ctrl + K`:** Para abrir el panel de commit, revisar los archivos modificados y confirmarlos.
* **`Fn + Alt + Insert`:** Para abrir el menú de generación rápida (muy útil para crear nuevos archivos en el paquete o generar el método `toString()`).
* **`Alt + Enter`:** Para abrir las acciones de contexto (solucionar errores, crear un `record` al instante, o corregir errores de casteo de tipos).
* **`Ctrl + Shift + Flechas (Arriba/Abajo)`:** Para mover líneas o bloques de código enteros hacia arriba o hacia abajo sin tener que cortar y pegar.
* **`Alt + Flechas (Izquierda/Derecha)`:** Para cambiar rápidamente entre las pestañas de los archivos que tengo abiertos en el editor.

## Vídeo explicativo
Aquí dejo el enlace al vídeo donde enseño cómo he hecho todo esto, muestro el uso de los atajos y el historial de Git:
[Ver vídeo explicativo (YouTube)]([https://youtu.be/4tzMQVnvPqA](https://youtu.be/073rDLMudEo))
