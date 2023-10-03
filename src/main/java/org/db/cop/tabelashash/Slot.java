package org.db.cop.tabelashash;

import java.util.LinkedList;
import java.util.List;

class Slot {
  private Integer elemento;
  private LinkedList<Integer> colisoes;

  public Slot(Integer elemento) {
    this.elemento = elemento;
    this.colisoes = new LinkedList<>();
  }

  public Integer getElemento() {
    return elemento;
  }

  public void setElemento(Integer elemento) {
    this.elemento = elemento;
  }

  public List<Integer> getColisoes() {
    return colisoes;
  }
}

