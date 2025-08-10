package com.balitechy.spacewar.main.factories;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.Style;
import com.balitechy.spacewar.main.background.BackgroundDraw;
import com.balitechy.spacewar.main.background.BackgroundRenderer;
import com.balitechy.spacewar.main.background.IBackground;

public class BackgroundFactory {
    public static IBackground createBackground(Game game) {
        Style sty = game.style;
        switch (sty) {
            case IMAGE:
                return new BackgroundRenderer();

            case DRAW:
                return new BackgroundDraw();

            case COLOR:
                return new BackgroundDraw(); // Elige color aleatorio internamente

            default:
                throw new IllegalArgumentException("Estilo de Fondo no soportado: " + sty);
        }
    }
}
