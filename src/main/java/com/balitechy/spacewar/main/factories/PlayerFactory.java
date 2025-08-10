package com.balitechy.spacewar.main.factories;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.Style;
import com.balitechy.spacewar.main.player.IPlayer;
import com.balitechy.spacewar.main.player.PlayerColor;
import com.balitechy.spacewar.main.player.PlayerDraw;
import com.balitechy.spacewar.main.player.PlayerImage;

public class PlayerFactory {
    public static IPlayer createPlayer(double x, double y, Game game) {
        Style sty = game.style;
        switch (sty) {
            case IMAGE:
                return new PlayerImage(x, y, game);

            case DRAW:
                return new PlayerDraw(x, y, game);

            case COLOR:
                return new PlayerColor(x, y, game); // Elige color aleatorio internamente

            default:
                throw new IllegalArgumentException("Estilo de Jugador no soportado: " + sty);
        }
    }
}
