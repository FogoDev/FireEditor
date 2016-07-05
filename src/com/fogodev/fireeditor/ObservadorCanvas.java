package com.fogodev.fireeditor;

public interface ObservadorCanvas {
    void desenhar(Canvas c);
    void aperto(int x, int y);
    void solta(int x, int y);
    void arrasto(int x, int y);
}