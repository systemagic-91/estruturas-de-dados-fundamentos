package org.db.cop.tabelashash;

public class TabelaHash {

  private static final int TAMANHO_INICIAL = 10;
  private Slot[] hash;

  public TabelaHash() {

    this.hash = new Slot[TAMANHO_INICIAL];

    for (int i = 0; i < TAMANHO_INICIAL; i++) {
      hash[i] = new Slot(null);
    }
  }

  public void inserir(Integer elemento) {

    int indice = hash(elemento);

    // Obtém o slot associado a esse índice
    Slot slot = hash[indice];

    // Se o slot não tiver colisões, adiciona o elemento diretamente
    if (slot.getElemento() == null) {
      slot.setElemento(elemento);
    } else {
      // Se houver colisões, adiciona o elemento na lista ligada de colisões
      slot.getColisoes().add(elemento);
    }
  }

  public boolean buscar(Integer elemento) {
    int indice = hash(elemento);

    // Obtém o slot associado a esse índice
    Slot slot = hash[indice];

    // Verifica se o elemento está no slot ou na lista de colisões
    if (slot.getElemento() != null && slot.getElemento().equals(elemento)) {
      return true; // Elemento encontrado no próprio slot
    } else {
      return slot.getColisoes().contains(elemento); // Elemento encontrado na lista de colisões
    }
  }

  private int hash(Integer elemento) {
    return Math.abs(elemento) % TAMANHO_INICIAL;
  }

  public static void main(String[] args) {
    TabelaHash tabelaHash = new TabelaHash();

    tabelaHash.inserir(5);
    tabelaHash.inserir(7);
    tabelaHash.inserir(15);
    tabelaHash.inserir(25);

    System.out.println("Buscar 15: " + tabelaHash.buscar(15)); // true
    System.out.println("Buscar 10: " + tabelaHash.buscar(10)); // false
    System.out.println("Buscar 07: " + tabelaHash.buscar(7)); // true
  }
}