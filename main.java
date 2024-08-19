public class main nodo {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);

        System.out.println("Elementos de la lista");
        lista.recorrer();

        System.out.println("Buscar 2: " + lista.buscar(2));
        lista.eliminar(2);
        System.out.println(" Elementos despues de eliminar 2: ");
        lista.recorrer();

        System.out.println("¿la lista esta vacia?" + lista.estaVacia() );
    }
}
