package com.fogodev.fireeditor;

public abstract class AbstractFigura implements Figura {
    int x, y;
    double r, g, b;
    
    public AbstractFigura(int _x, int _y, double _r, double _g, double _b) {
        x = _x; y = _y;
        r = _r; g = _g; b = _b;
    }
    
    public void mover(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }
}