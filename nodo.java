public class nodo {

    int dato;
    nodo siguiente;

    public nodo (int dato){
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada{
     private nodo cabeza;
      public ListaEnlazada(){
        this.cabeza = null;
      }

      public void insertar (int dato){
        nodo nuevoNodo = new nodo (dato);
        if(cabeza == null){
            cabeza = nuevoNodo;
        }else{
            nodo temp = cabeza;
            while(temp.siguiente != null){
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
      }

      public void eliminar (int dato){
        if (cabeza == null) return;

        if(cabeza.dato == dato){
            cabeza = cabeza.siguiente;
            return;
        }

        nodo temp = cabeza;
        while (temp.siguiente != null && temp.siguiente.dato !=dato){
            temp = temp.siguiente;
        }

        if(temp.siguiente !=null){
            temp.siguiente = temp.siguiente.siguiente;
        }
      }



      public boolean buscar (int dato){
        nodo temp = cabeza;
        while (temp != null){
            if (temp.dato ==dato){
                return true;
            }

            temp = temp.siguiente;
        }

        return false;
      }

      public void recorrer(){
        nodo temp = cabeza;
        while (temp != null){
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
      }


      public boolean estaVacia(){
        return cabeza == null;
      }
      
}