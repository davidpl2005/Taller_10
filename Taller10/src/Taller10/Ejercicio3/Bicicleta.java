package Taller10.Ejercicio3;

class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}

public class Bicicleta extends Vehiculo {
    // Este metodo cambia la firma y no es sobrescritura correcta
    public void moverse(int velocidad) {
        System.out.println("La bicicleta se está moviendo a " + velocidad + " km/h.");
    }
    /*
    public void moverse() {  // No usa @Override
        System.out.println("La bicicleta se está moviendo.");
    }
     */
}


