package com.fogodev.fireeditor;

/**
 * Criado por ericson em 05/07/16.
 *
 * https://github.com/fogodev
 */
public class TriangleMode2 extends TriangleMode
{
    private Dot dot;

    public TriangleMode2(ModeloEditor model, Dot dot)
    {
        super(model);
        this.dot = dot;
    }

    @Override
    public void fim(int x, int y)
    {
        Dot dot2 = new Dot(x, y, this.model.r, this.model.g, this.model.b);
        this.model.figuras.add(dot2);
        this.model.feitos.push(new ComandoFigura(dot2));
        this.model.triangle3(this.dot, dot2);
    }

    @Override
    public void abortar()
    {
        this.model.figuras.remove(this.dot);
        this.model.feitos.pop();
    }
}
