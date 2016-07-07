package com.fogodev.fireeditor;

/**
 * Criado por ericson em 05/07/16.
 *
 * https://github.com/fogodev
 */
abstract public class TriangleMode extends ModoEditor
{

    protected TriangleMode(ModeloEditor model)
    {
        super(model);
    }

    @Override
    public void inicio(int x, int y)
    {

    }

    @Override
    public void meio(int x, int y)
    {

    }

    @Override
    public String tag()
    {
        return "tri";
    }
}
