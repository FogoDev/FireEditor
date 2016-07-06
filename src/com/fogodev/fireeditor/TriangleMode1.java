package com.fogodev.fireeditor;

/**
 * Criado por ericson em 05/07/16.
 *
 * https://github.com/fogodev
 */
public class TriangleMode1 extends TriangleMode
{
    public TriangleMode1(ModeloEditor model)
    {
        super(model);
    }

    @Override
    public void fim(int x, int y)
    {
        Dot dot = new Dot(x, y, this.model.r, this.model.g, this.model.b);
        this.model.figuras.add(dot);
        this.model.feitos.push(new ComandoFigura(dot));
        this.model.triangle2(dot);

    }
}
