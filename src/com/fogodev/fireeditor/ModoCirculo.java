package com.fogodev.fireeditor;

public class ModoCirculo implements ModoEditor {
    ModeloEditor modelo;
    Circulo circ;
    
    public ModoCirculo(ModeloEditor _modelo) {
        modelo = _modelo;
    }
    
    public void inicio(int x, int y) {
        circ = new Circulo(x, y, 0, modelo.r, modelo.g, modelo.b);
        modelo.figuras.add(circ);
    }
    
    public void meio(int x, int y) {
        circ.calculaRaio(x, y);
    }
    
    public void fim(int x, int y) {
        circ.calculaRaio(x, y);
        modelo.feitos.push(new ComandoFigura(circ));
        modelo.circulo();
    }

    public String tag() { return "circ"; }
}