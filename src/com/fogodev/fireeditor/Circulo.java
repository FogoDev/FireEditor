package com.fogodev.fireeditor;

public class Circulo extends AbstractFigura {
    int raio;
    
    public Circulo(int _cx, int _cy, int _raio, double _r, double _g, double _b) {
        super(_cx, _cy, _r, _g, _b);
        raio = _raio;
    }
    
    public void calculaRaio(int x, int y) {
        raio = (int)Math.round(Math.sqrt(Math.pow(x - this.x, 2) +
                                         Math.pow(y - this.y, 2)));
    }
    
    public void desenhar(ModeloCanvas mc) {
        mc.circulo(x, y, raio, r, g, b);
    }
    
    public boolean dentro(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) +
                         Math.pow(y - this.y, 2)) <= raio;
    }
}