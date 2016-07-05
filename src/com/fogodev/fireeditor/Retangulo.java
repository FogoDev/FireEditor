package com.fogodev.fireeditor;

public class Retangulo extends AbstractFigura {
    int larg, alt;
    int ox, oy;
    
    public Retangulo(int _x, int _y, int _larg, int _alt, double _r, double _g, double _b) {
        super(_x, _y, _r, _g, _b);
        ox = x; oy = y;
        larg = _larg; alt = _alt;
    }
    
    public void outroCanto(int x, int y) {
        if(x < ox) {
            this.x = x;
            larg = ox - x;
        } else {
            larg = x - ox;
        }
        if(y < oy) {
            this.y = y;
            alt = oy - y;
        } else {
            alt = y - oy;
        }
    }
    
    public void desenhar(ModeloCanvas mc) {
        mc.retangulo(x, y, larg, alt, r, g, b);
    }
    
    public boolean dentro(int x, int y) {
        return x >= this.x && x <= this.x + larg &&
               y >= this.y && y <= this.y + alt;
    }
}