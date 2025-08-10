package com.balitechy.spacewar.main.factories;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.Style;
import com.balitechy.spacewar.main.bullet.BulletColor;
import com.balitechy.spacewar.main.bullet.BulletDraw;
import com.balitechy.spacewar.main.bullet.BulletImage;
import com.balitechy.spacewar.main.bullet.IBullet;

public class BulletFactory {

    public static IBullet createBullet(double x, double y, Game game) {
        Style sty = game.style;
        switch (sty) {
            case IMAGE:
                return new BulletImage(x, y, game);

            case DRAW:
                return new BulletDraw(x, y);

            case COLOR:
                return new BulletColor(x, y); // Elige color aleatorio internamente

            default:
                throw new IllegalArgumentException("Estilo de bala no soportado: " + sty);
        }
    }
}

