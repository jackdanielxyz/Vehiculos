class Vehiculo {
    String matricula;
    String color;
    String modelo;

    public Vehiculo(String matricula, String color, String modelo) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
    }
}

class Taxi extends Vehiculo {
    public Taxi(String matricula, String color, String modelo) {
        super(matricula, color, modelo);

    }
}

class Tranvia extends Vehiculo {
    public Tranvia(String matricula, String color, String modelo) {
        super(matricula, color, modelo);
    }
}

class Autobus extends Vehiculo {
    public Autobus(String matricula, String color, String modelo) {
        super(matricula, color, modelo);
    }
}