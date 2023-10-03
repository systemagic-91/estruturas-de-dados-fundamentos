package org.db.cop.arvores;


public class ArvoreBinariaBusca<T extends Comparable<T>> {
  private NoArvore<T> raiz;

  public ArvoreBinariaBusca() {
    this.raiz = null;
  }

  public void inserir(T dado) {
    raiz = inserirRec(raiz, dado);
  }

  private NoArvore<T> inserirRec(NoArvore<T> raiz, T dado) {

    if (raiz == null) {
      raiz = new NoArvore<>(dado);
      return raiz;
    }

    if (dado.compareTo(raiz.dado) < 0) {
      raiz.esquerda = inserirRec(raiz.esquerda, dado);
    } else if (dado.compareTo(raiz.dado) > 0) {
      raiz.direita = inserirRec(raiz.direita, dado);
    }

    return raiz;
  }

  public void percorrerEmOrdem() {
    percorrerEmOrdem(raiz);
  }

  private void percorrerEmOrdem(NoArvore<T> raiz) {
    if (raiz != null) {
      percorrerEmOrdem(raiz.esquerda);
      System.out.print(raiz.dado + " ");
      percorrerEmOrdem(raiz.direita);
    }
  }

}

