package com.fogodev.fireeditor;

public interface Figura {
    boolean dentro(int x, int y);
    void mover(int dx, int dy);
    void desenhar(ModeloCanvas c);
}