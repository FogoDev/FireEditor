package com.fogodev.fireeditor;

public class ComandoMover implements Comando {
    Figura fig;
    int dx, dy;
    
    public ComandoMover(Figura _fig, int _dx, int _dy) {
        fig = _fig;
        dx = _dx; dy = _dy;
    }
    
    public void desfazer(ModeloEditor modelo) {
        fig.mover(-dx, -dy);
    }
    
    public void refazer(ModeloEditor modelo) {
        fig.mover(dx, dy);
    }
}