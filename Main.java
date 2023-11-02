public class Main {
    public static void main(String[] args)
    {
        Figura f1 = new Triangulo();
        System.out.println(f1);
        f1 = new Triangulo("Verde",3.0f);
        System.out.println(f1);
        f1 = new Circulo();
        System.out.println(f1);
        f1 = new Circulo("Amarillo", 3);
        System.out.println(f1);
        f1 = new Rectangulo();
        System.out.println(f1);
        f1 = new Rectangulo("Azul",4.5f,9.3f);
        System.out.println(f1);
        f1 = new Hexagono();
        System.out.println(f1);
        f1 = new Hexagono("Magenta",3.99f);
        System.out.println(f1);
        System.out.println(f1.getColor());
    }

}