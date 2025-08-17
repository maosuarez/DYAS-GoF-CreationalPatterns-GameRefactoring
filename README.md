# Universidad de la Sabana
## Diseño y Arquitectura de Software

Software de microcontrolador para la fabricación automática de pizza.

# 🚀 Space War 2D

**Space War 2D** es un juego desarrollado en Java que implementa el patrón de diseño **Abstract Factory** para permitir múltiples estilos visuales. El jugador controla una nave espacial que puede moverse en todas las direcciones y disparar balas. El diseño del juego puede cambiar entre tres estilos distintos: vectorial, vectorial colorido y basado en sprites.

## 🎮 Características

- Fondo animado, jugador y balas renderizados según el estilo seleccionado.
- Uso del patrón **Abstract Factory** para desacoplar la lógica del juego del estilo gráfico.

## 🧱 Estructura del Proyecto

- `Game.java`: clase principal que gestiona el ciclo de vida del juego.
- `Interfaces`: contiene interfaces como `IPlayer` e `IBackground` que definen los contratos para los componentes del juego.
- `VectorGameFactory`, `VectorFullColorGameFactory`, `SpriteGameFactory`: fábricas que implementan diferentes estilos visuales.
- `SpritesImageLoader`: gestiona la carga de imágenes para el estilo basado en sprites.

## 🧪 Cómo cambiar el estilo del juego

En el método `main` de la clase `Game`, encontrarás tres líneas que instancian diferentes fábricas:

```java
game = new VectorGameFactory();
game = new VectorFullColorGameFactory();
game = new SpriteGameFactory();
```
Para seleccionar un estilo, debes comentar las dos líneas que no deseas usar, dejando solo la fábrica que quieres activar. Por ejemplo, para usar el estilo vectorial colorido:

```java
// game = new VectorGameFactory();
game = new VectorFullColorGameFactory();
// game = new SpriteGameFactory();
```

## 🛠️ Requisitos
- Java 8 o superior
- IDE como IntelliJ IDEA, Eclipse o VS Code con soporte para Java
- Librerías estándar de AWT y Swing


Modificado por **Mauricio Suarez**
<a rel="license" href="http://creativecommons.org/licenses/by-nc/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc/4.0/88x31.png" /></a><br />Este contenido hace parte del curso Procesos de Desarrollo de Software del programa de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería, y está licenciado como <a rel="license" href="http://creativecommons.org/licenses/by-nc/4.0/">Creative Commons Attribution-NonCommercial 4.0 International License</a>.



