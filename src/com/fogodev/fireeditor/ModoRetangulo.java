package com.fogodev.fireeditor;

public class ModoRetangulo implements ModoEditor {
    ModeloEditor modelo;
    Retangulo ret;
    
    public ModoRetangulo(ModeloEditor _modelo) {
        modelo = _modelo;
    }
    
    public void inicio(int x, int y) {
        ret = new Retangulo(x, y, 0, 0, modelo.r, modelo.g, modelo.b);
        modelo.figuras.add(ret);
    }
    
    public void meio(int x, int y) {
        ret.outroCanto(x, y);
    }
    
    public void fim(int x, int y) {
        Object o = new Object();
        ret.outroCanto(x, y);
        modelo.feitos.push(new ComandoFigura(ret));
        modelo.retangulo();
    }

    @Override
    public void abortar()
    {

    }

    public String tag() { return "ret"; }
}


