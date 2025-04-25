import Models.Direccion;
import Models.Persona;
import Controllers.PersonaController;
import Views.viewConsole;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Crear un arreglo de 5 personas
        Persona[] personas = new Persona[5];

        // Crear direcciones y personas
        personas[0] = new Persona("Maria", "Lopez", 30, new Direccion("Calle 2", 23, 56));
personas[1] = new Persona("Pedro", "Ramirez", 35, new Direccion("Calle 3", 34, 67));
personas[2] = new Persona("Ana", "Martinez", 28, new Direccion("Calle 4", 45, 78));
personas[3] = new Persona("Juan", "Perez", 25, new Direccion("Calle 1", 12, 45));
personas[4] = new Persona("Luis", "Gomez", 40, new Direccion("Calle 5", 56, 89));
        PersonaController pC = new PersonaController();
        viewConsole vC = new viewConsole();

        pC.sortBydireccion(personas);
        vC.printPersonas(personas);

        Persona pB = pC.findPersonaByCodigoDireccion(personas, 56);
        if (pB == null) {
            System.out.println("x: No existe");
        } else {
            System.out.println("La persona es " + pB);
        }

        System.out.println(pB == null ? "No existe" : "La persona es " + pB);
    }
}

 