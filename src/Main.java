
public class Main {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi("BGF-7452", "Negro", "Nissan");
        Taxi taxi2 = new Taxi("MDE-8127", "Blanco", "Toyota");
        Taxi taxi3 = new Taxi("PLO-6589", "Azul", "Chevrolet");
        Taxi taxi4 = new Taxi("LKC-3411", "Verde", "Ford");
        Taxi taxi5 = new Taxi("GTI-8723", "Negro", "Hyundai");

        System.out.println("Informacion de los taxis:");
        System.out.println("Taxi 1: Matricula: " + taxi1.matricula + ", Color: " + taxi1.color + ", Modelo: " + taxi1.modelo);
        System.out.println("Taxi 2: Matricula: " + taxi2.matricula + ", Color: " + taxi2.color + ", Modelo: " + taxi2.modelo);
        System.out.println("Taxi 3: Matricula: " + taxi3.matricula + ", Color: " + taxi3.color + ", Modelo: " + taxi3.modelo);
        System.out.println("Taxi 4: Matricula: " + taxi4.matricula + ", Color: " + taxi4.color + ", Modelo: " + taxi4.modelo);
        System.out.println("Taxi 5: Matricula: " + taxi5.matricula + ", Color: " + taxi5.color + ", Modelo: " + taxi5.modelo);

    }
}
