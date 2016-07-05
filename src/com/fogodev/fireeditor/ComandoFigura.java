package com.fogodev.fireeditor;

public class ComandoFigura implements Comando {
    Figura fig;
    
    public ComandoFigura(Figura _fig) {
        fig = _fig;
    }
    
    public void desfazer(ModeloEditor modelo) {
        modelo.figuras.remove(fig);
    }
    
    public void refazer(ModeloEditor modelo) {
        modelo.figuras.add(fig);
    }
}