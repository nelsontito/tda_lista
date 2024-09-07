public class nodo {
  private Object dato;
  private nodo enlace;

  public nodo() {
      dato = null;
      enlace = null;
  }

  public nodo(Object dato) {
      this.dato = dato;
      enlace = null;
  }

  public nodo(Object dato, nodo enlace) {
      this.dato = dato;
      this.enlace = enlace;
  }

  public nodo getEnlace() {
      return enlace;
  }

  public void setEnlace(nodo enlace) {
      this.enlace = enlace;
  }

  public Object getDato() {
      return dato;
  }

  public void setDato(Object dato) {
      this.dato = dato;
  }

  @Override
  public String toString() {
      return "Nodo [dato=" + dato + ", enlace=" + enlace + "]";
  }

}
