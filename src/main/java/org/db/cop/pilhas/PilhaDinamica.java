package org.db.cop.pilhas;

public class PilhaDinamica<T> {

  No<T> topo;
  int tamanho;

  public PilhaDinamica(){
    this.topo = null;
    this.tamanho = 0;
  }

  public void empilhar(T elemento){
    No<T> novoNo = new No<>(elemento);
    novoNo.proximo = topo;
    topo = novoNo;
    tamanho++;
  }

  public T desempilhar(){
    if (estaVazia()) {
      throw new IllegalStateException("A pilha está vazia.");
    }

    T desempilhado = topo.elemento;
    topo = topo.proximo;
    tamanho--;
    return desempilhado;
  }

  public boolean estaVazia(){
    return tamanho == 0;
  }

  public int tamanho(){
    return tamanho;
  }

}
