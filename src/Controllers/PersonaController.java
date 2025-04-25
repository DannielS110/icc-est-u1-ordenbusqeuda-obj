package Controllers;
import Models.Persona;  
import Models.Direccion;
public class PersonaController {
    
    public void sortBydireccion(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].compareCodigoDireccion(personas[j + 1])) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }
    public Persona findPersonaByCodigoDireccion(Persona[] personas, int codigo) {
        for (Persona persona : personas) {
            if (persona.equalsByCodigoDireccion(codigo)) {
                return persona;
            }
        }
        return null;
    }
}



