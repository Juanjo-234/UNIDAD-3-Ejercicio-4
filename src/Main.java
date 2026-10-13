//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Estudiante estudiante = new Estudiante("AB1234" , "Lucía Pérez");

System.out.println("Cargando notas");
estudiante.agregarNota(8.9);
estudiante.agregarNota(7.0);
estudiante.agregarNota(9.6);
estudiante.agregarNota(9.0);
estudiante.agregarNota(10.0);

System.out.println("Calculando promedio");
double promedioFinal =  estudiante.calcularPromedio();
System.out.println("Promedio final: " + promedioFinal);
}
