import ListaCircular.Lista;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion = 0, element;
        Lista lista = new Lista();

        do {
            try {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                            1. Agregar nodo a la lista
                            2. Eliminar un nodo de la lista
                            3. Mostrar los datos de la lista
                            4. Salir""", "Menu de opciones", JOptionPane.INFORMATION_MESSAGE));
                } catch (Exception e) {
                    opcion = 8;
                }
                switch (opcion) {
                    case 1:
                        try {
                            element = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento: ", "Insertando al inicio", JOptionPane.INFORMATION_MESSAGE));
                            // Agregando al nodo
                            lista.addNodo(element);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Hubo un error " + n.getMessage());
                        }
                        break;
                    case 2:
                        lista.deleteNode();
                        break;
                    case 3:
                        if (!lista.isEmpty()) lista.showList();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } while (opcion != 4);

    }
}