package org.db.cop.filas;


import static java.lang.System.*;

public class FilaEstatica<T> {
  private int capacidade;
  private int tamanho;
  private T[] fila;
  private int primeiro; // indice do elemento da frente da fila
  private int ultimo;  // indice do último elemento da fila

  public FilaEstatica(int capacidade) {
    this.capacidade = capacidade;
    this.tamanho = 0;
    this.fila = (T[]) new Object[capacidade];
    this.primeiro = 0;
    this.ultimo = -1;
  }

  public boolean estaVazia() {
    return tamanho == 0;
  }

  public boolean estaCheia() {
    return tamanho == capacidade;
  }

  public int tamanho() {
    return tamanho;
  }

  public void enfileirar(T elemento) {
    if (estaCheia()) {
      out.println("A fila está cheia. Não é possível enfileirar.");
      return;
    }
    ultimo = (ultimo + 1) % capacidade;
    fila[ultimo] = elemento;
    tamanho++;
  }

  public T desenfileirar() {
    if (estaVazia()) {
      out.println("A fila está vazia. Não é possível desenfileirar.");
      return null; // Valor de retorno inválido
    }
    T elemento = fila[primeiro];
    primeiro = (primeiro + 1) % capacidade;
    tamanho--;
    return elemento;
  }

  public T primeiro() {
    if (estaVazia()) {
      out.println("A fila está vazia. Não há elementoo na frente.");
      return null; // Valor de retorno inválido
    }
    return fila[primeiro];
  }

}



