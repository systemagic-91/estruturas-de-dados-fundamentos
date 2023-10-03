package org.db.cop.arvores;

class NoArvore<T extends Comparable<T>> {
  T dado;
  NoArvore<T> esquerda, direita;

  public NoArvore(T dado) {
    this.dado = dado;
    this.esquerda = this.direita = null;
  }
}