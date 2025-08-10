package com.balitechy.spacewar.main.background;

import java.awt.Canvas;
import java.awt.Graphics;
import java.io.IOException;

public interface IBackground {
    public void render(Graphics g, Canvas c)throws IOException;
}
