package com.fogodev.fireeditor;

/**
 * Criado por ericson em 05/07/16.
 *
 * https://github.com/fogodev
 */
public class ComandoApagar implements Comando
{
    private Figura figure;

    public ComandoApagar(Figura figure)
    {
        this.figure = figure;
    }

    @Override
    public void desfazer(ModeloEditor modelo)
    {
        modelo.figuras.add(this.figure);
    }

    @Override
    public void refazer(ModeloEditor modelo)
    {
        modelo.figuras.remove(this.figure);
    }
}
