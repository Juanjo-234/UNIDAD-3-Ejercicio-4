import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String legajo;
    private String nombre;
    private List<Double>notas;

    public  Estudiante(String legajo, String nombre){
        this.legajo = legajo;
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNota(double nota){
if(nota >= 0 && nota <= 10){
    notas.add(nota);
    System.out.println("NOta agregada exitosamente. Nota: " + nota);
}else{
    System.out.println("Nota fuera del rango permitido. Ingrese una nota del 1 al 10.");
}

    }


    double calcularPromedio(){
        if(notas.isEmpty()){
            System.out.println("El alumno no tiene notas registradas.");
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}
