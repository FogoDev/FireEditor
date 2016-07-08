package com.fogodev.fireeditor;

/**
 * Criado por ericson em 07/07/16.
 *
 * https://github.com/fogodev
 */
public class ChangeColorCommand implements Comando
{
    private Figura figure;
    private double [] oldColors;
    private double [] newColors;

    public ChangeColorCommand(Figura figure, double [] oldColors, double [] newColors)
    {
        this.figure = figure;
        this.oldColors = oldColors;
        this.newColors = newColors;
    }

    @Override
    public void desfazer(ModeloEditor modelo)
    {
        this.figure.changeColor(this.oldColors);
    }

    @Override
    public void refazer(ModeloEditor modelo)
    {
        this.figure.changeColor(this.newColors);
    }
}
