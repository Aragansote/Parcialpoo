package tmb;

public class tmb {
    public double calcularTMB(Persona persona) {
        double tmb = -1; // Valor predeterminado para TMB en caso de género no válido

        if (persona.getGenero().equalsIgnoreCase("masculino")) {
            tmb = 10 * persona.getPeso() + 6.25 * persona.getAltura() - 5 * persona.getEdad() + 5;
        } else if (persona.getGenero().equalsIgnoreCase("femenino")) {
            tmb = 10 * persona.getPeso() + 6.25 * persona.getAltura() - 5 * persona.getEdad() - 161;
        } else {
            System.out.println("Error: El género debe ser 'masculino' o 'femenino'");
        }

        return tmb;
    }

    public static void main(String[] args) {
        // Crear una persona
        Persona persona = new Persona(30, 70, 170, "masculino");

        // Crear una instancia de la Calculadora
        mtb mtb = new mtb();

        // Calcular la TMB para la persona
        double tmb = calculadora.calcularTMB(persona);

        // Verificar si el valor de TMB es válido
        if (tmb != -1) {
            // Mostrar el resultado
            System.out.println("TMB para " + persona.getGenero() + ": " + tmb);
        }
    }
}

}
