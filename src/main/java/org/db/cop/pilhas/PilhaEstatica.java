package org.db.cop.pilhas;

import java.util.EmptyStackException;

public class PilhaEstatica<E> {
  private Object[] elementos;
  private int tamanho;
  private static final int TAMANHO_PADRAO = 10;

  public PilhaEstatica() {
    this.elementos = new Object[TAMANHO_PADRAO];
    this.tamanho = 0;
  }

  public PilhaEstatica(int capacidade) {
    if (capacidade <= 0) {
      throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
    }
    this.elementos = new Object[capacidade];
    this.tamanho = 0;
  }

  public void empilhar(E elemento) {
    if (tamanho == elementos.length) {
      throw new IllegalStateException("A pilha está cheia.");
    }
    elementos[tamanho] = elemento;
    tamanho++;
  }

  public E desempilhar() {
    if (estaVazia()) {
      throw new EmptyStackException();
    }
    tamanho--;
    E elementoDesempilhado = (E) elementos[tamanho];
    elementos[tamanho] = null; // Libera a referência para o elemento removido
    return elementoDesempilhado;
  }

  public E topo() {
    if (estaVazia()) {
      throw new EmptyStackException();
    }
    return (E) elementos[tamanho - 1];
  }

  public int tamanho() {
    return tamanho;
  }

  public boolean estaVazia() {
    return tamanho == 0;
  }
}
