package org.db.cop.filas;

import static java.lang.System.*;

public class FilaDinamica<T> {
  private No<T> primeiro;    // Referencia para Nó na frente da fila
  private No<T> ultimo;     // Referencia para Nó no final da fila
  private int tamanho;      // Tamanho atual da fila


  public FilaDinamica() {
    primeiro = null;
    ultimo = null;
    tamanho = 0;
  }

  public boolean estaVazio() {
    return tamanho == 0;
  }

  public int tamanho() {
    return tamanho;
  }

  public void enfileirar(T elemento) {
    No<T> novoNo = new No<>(elemento);
    if (estaVazio()) {
      primeiro = novoNo;
      ultimo = novoNo;
    } else {
      ultimo.proximo = novoNo;
      ultimo = novoNo;
    }
    tamanho++;
  }

  public T desenfileirar() {
    if (estaVazio()) {
      out.println("A fila está vazia. Não é possível desenfileirar.");
      return null;
    }
    T elemento = primeiro.elemento;
    primeiro = primeiro.proximo;
    tamanho--;
    return elemento;
  }

  public T primeiro() {
    if (estaVazio()) {
      out.println("A fila está vazia. Não há elementoo na frente.");
      return null;
    }
    return primeiro.elemento;
  }

}

