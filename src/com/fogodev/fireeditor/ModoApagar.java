package com.fogodev.fireeditor;

/**
 * Criado por ericson em 05/07/16.
 *
 * https://github.com/fogodev
 */
public class ModoApagar extends ModoEditor
{
    private Figura figure;

    public ModoApagar(ModeloEditor model)
    {
        super(model);
    }

    @Override
    public void inicio(int x, int y)
    {
        for(Figura figure: model.figuras) {
            if(figure.dentro(x, y)) {
                this.figure = figure;
                break;
            }
        }
    }

    @Override
    public void meio(int x, int y)
    {
        // THERE IS NO MIDDLE HERE
    }

    @Override
    public void fim(int x, int y)
    {
        this.model.figuras.remove(this.figure);
        this.model.feitos.push(new ComandoApagar(this.figure));
    }

    @Override
    public String tag()
    {
        return "del";
    }
}
