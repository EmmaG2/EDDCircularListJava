package ListaCircular;

public class Lista {
    Nodo ultimo;

    public Lista() {
        this.ultimo = null;
    }

    // Metodo para saber cuando la lista esta vacía
    public boolean isEmpty() {
        return this.ultimo == null;
    }

    // Metodo para insertar Nodos
    public Lista addNodo(int elemento) {
        Nodo nodo = new Nodo(elemento);

        if (ultimo != null) {
            nodo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nodo;
        }

        ultimo = nodo;

        return this;
    }

    // Metodo para recorrer la lista
    public void showList() {
        Nodo auxiliar = ultimo.siguiente;
        String listaNodos = "";

        do{
            listaNodos = "[" + auxiliar.dato + "]->";
        } while(auxiliar != ultimo.siguiente);

        System.out.println("Mostrando lista\n" + listaNodos);
    }
}
