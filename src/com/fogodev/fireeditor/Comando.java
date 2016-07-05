package com.fogodev.fireeditor;

public interface Comando {
    void desfazer(ModeloEditor modelo);
    void refazer(ModeloEditor modelo);
}