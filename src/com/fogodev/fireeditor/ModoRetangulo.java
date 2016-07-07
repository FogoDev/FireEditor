package com.fogodev.fireeditor;

public class ModoRetangulo extends ModoEditor 
{

    Retangulo ret;
    
    public ModoRetangulo(ModeloEditor model) 
    {
        super(model);
    }
    
    public void inicio(int x, int y) 
    {
        ret = new Retangulo(x, y, 0, 0, this.model.r, this.model.g, this.model.b);
        this.model.figuras.add(ret);
    }
    
    public void meio(int x, int y)
    {
        ret.outroCanto(x, y);
    }
    
    public void fim(int x, int y)
    {
        ret.outroCanto(x, y);
        this.model.feitos.push(new ComandoFigura(ret));
        this.model.retangulo();
    }

    public String tag() { return "ret"; }
}


