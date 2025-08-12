package com.balitechy.spacewar.main.VectorFullColorGameFactory;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.AbstractComponents.APlayer;
import com.balitechy.spacewar.main.Interfaces.IBullet;

public class PlayerColor extends APlayer {
	
	public PlayerColor(double x, double y, Game game){
		super(x, y, game);
	}

    public void shoot(){
		IBullet b = new BulletColor(x+(WIDTH/2)-5, y-18);
		game.getBullets().addBullet(b);
	}
	
	@Override
    public void render(Graphics g) {
        // Generar color aleatorio
        Color randomColor = new Color(
            (int)(Math.random() * 256), // Rojo
            (int)(Math.random() * 256), // Verde
            (int)(Math.random() * 256)  // Azul
        );

        // Usar el color aleatorio para el relleno
        g.setColor(randomColor);

        int[] xPoints = {
            (int) x + WIDTH / 2,   // punto superior
            (int) x,               // esquina inferior izquierda
            (int) x + WIDTH        // esquina inferior derecha
        };
        int[] yPoints = {
            (int) y,               // punto superior
            (int) y + HEIGHT,      // parte inferior izquierda
            (int) y + HEIGHT       // parte inferior derecha
        };

        // Dibujar relleno del triángulo
        g.fillPolygon(xPoints, yPoints, 3);

        // Dibujar contorno negro
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, 3);
    }

}
