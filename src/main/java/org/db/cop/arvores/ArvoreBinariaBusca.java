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
  public boolean buscar(T dado) {
    return buscarRec(raiz, dado);
  }

  private boolean buscarRec(NoArvore<T> raiz, T dado) {
    if (raiz == null) {
      return false;
    }

    int comparacao = dado.compareTo(raiz.dado);

    if (comparacao == 0) {
      return true;
    } else if (comparacao < 0) {
      return buscarRec(raiz.esquerda, dado);
    } else {
      return buscarRec(raiz.direita, dado);
    }
  }

  public void remover(T dado) {
    raiz = removerRec(raiz, dado);
  }

  private NoArvore<T> removerRec(NoArvore<T> raiz, T dado) {
    if (raiz == null) {
      return raiz;
    }

    int comparacao = dado.compareTo(raiz.dado);

    if (comparacao < 0) {
      raiz.esquerda = removerRec(raiz.esquerda, dado);
    } else if (comparacao > 0) {
      raiz.direita = removerRec(raiz.direita, dado);
    } else {
      // Nó com um ou nenhum filho
      if (raiz.esquerda == null) {
        return raiz.direita;
      } else if (raiz.direita == null) {
        return raiz.esquerda;
      }

      // Nó com dois filhos, encontrar o sucessor inordem (menor à direita)
      raiz.dado = minValue(raiz.direita);

      // Remover o sucessor inordem
      raiz.direita = removerRec(raiz.direita, raiz.dado);
    }

    return raiz;
  }

  private T minValue(NoArvore<T> raiz) {
    T minValue = raiz.dado;
    while (raiz.esquerda != null) {
      minValue = raiz.esquerda.dado;
      raiz = raiz.esquerda;
    }
    return minValue;
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




