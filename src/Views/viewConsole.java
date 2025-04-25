package Views;
import Models.Persona;
import Models.Direccion;
import Controllers.PersonaController;

public class viewConsole {
    public void printPersonas(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + " Apellido: " + personas[i].getApellido() + " Edad: " + personas[i].getEdad() + " Calle: " + personas[i].getDireccion().getCalle() + " Numero de Calle: " + personas[i].getDireccion().getNumeroDeCalle() + " Codigo: " + personas[i].getDireccion().getCodigo());
        }
    }
}
