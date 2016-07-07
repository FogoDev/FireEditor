package com.fogodev.fireeditor;

public class ModoCirculo extends ModoEditor
{

    Circulo circ;
    
    public ModoCirculo(ModeloEditor model)
    {
        super(model);
    }
    
    public void inicio(int x, int y)
    {
        circ = new Circulo(x, y, 0, this.model.r, this.model.g, this.model.b);
        this.model.figuras.add(circ);
    }
    
    public void meio(int x, int y)
    {
        circ.calculaRaio(x, y);
    }
    
    public void fim(int x, int y)
    {
        circ.calculaRaio(x, y);
        this.model.feitos.push(new ComandoFigura(circ));
        this.model.circulo();
    }

    public String tag()
    {
        return "circ";
    }
}