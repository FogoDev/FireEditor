package com.fogodev.fireeditor;

abstract public class ModoEditor
{
    protected ModeloEditor model;

    protected ModoEditor(ModeloEditor model)
    {
        this.model = model;
    }

    abstract void inicio(int x, int y);

    abstract void meio(int x, int y);

    abstract void fim(int x, int y);

    void abortar(){}

    abstract String tag();
}