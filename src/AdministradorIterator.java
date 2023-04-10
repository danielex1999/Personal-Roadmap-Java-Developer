import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class AdministradorIterator {
    public static void main(String[] args) throws InterruptedException {
        int opciIndice = 0;


// los Map (o mapas) los veremos mas adelante en el curso en profundidad
// pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
// también se les conoce como diccionarios para almacenar datos en base a un nombre.
        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        do {
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opciIndice = opciones.get(opcion.toString());
            }
            if (opciIndice == 1) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
            } else if (opciIndice == 2) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            } else if (opciIndice == 3) {
                JOptionPane.showMessageDialog(null, "Usuario agregar correctamente");
            } else if (opciIndice == 4) {
                JOptionPane.showMessageDialog(null, "Usuario enlistado correctamente");
            } else if (opciIndice == 5) {
                JOptionPane.showMessageDialog(null, "Haz salido con éxito!");
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            }

        }
        while (opciIndice != 5);

    }
}





