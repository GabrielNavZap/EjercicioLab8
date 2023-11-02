public abstract class Figura {
    String color;
    public abstract float area();
    public abstract float perimetro();
    public String getColor()
    {
        return this.color;
    }
}

class Triangulo extends Figura
{
    float lado;
    public Triangulo()
    {
        super.color = "Blanco";
        this.lado = 1;
    }
    public Triangulo(String color,float lado)
    {
        super.color = color;
        this.lado = lado;
    }
    public float area()
    {
        return ((this.lado*this.lado)*(float)(Math.sqrt(3.0)))/4;
    }
    public float perimetro()
    {
        return this.lado*3;
    }
    @Override
    public String toString()
    {
        return "Triangulo de color "+super.color+", lado con longitud "
        +this.lado+", con area de "+this.area()+" y perimetro de"+this.perimetro();
    }
}
class Circulo extends Figura
{
    double radio;

    public Circulo()
    {
        super.color="Blanco";
        this.radio=1.0;
    }
    public Circulo(String color, double radio)
    {
        super.color = color;
        this.radio = radio;
    }
    public float area()
    {
        return (float)((this.radio*this.radio)*Math.PI);
    }
    public float perimetro()
    {
        return (float)(Math.PI*2*this.radio);
    }
    @Override
    public String toString()
    {
        return "Circulo de color "+super.color+", radio de longitud " +this.radio+
                ", con area de "+this.area()+" y perimetro de"+this.perimetro();
    }
}
class Rectangulo extends Figura
{
    float base;
    float altura;
    public Rectangulo()
    {
        super.color = "Blanco";
        this.base = 2;
        this.altura = 1;
    }
    public Rectangulo(String color, float base, float altura)
    {
        super.color = color;
        this.base = base;
        this.altura = altura;
    }
    public float area()
    {
        return this.base*this.altura;
    }
    public float perimetro()
    {
        return 2*(this.base+this.altura);
    }
    @Override
    public String toString()
    {
        return "Rectangulo de color "+super.color+", base con longitud " +this.base+
               "altura de longitud "+this.altura+", con area de "+this.area()+
               " y perimetro de" +this.perimetro();
    }
}
class Hexagono extends Figura
{
    public float lado;
    public Hexagono()
    {
        super.color = "Blanco";
        this.lado = 1;
    }
    public Hexagono(String color, float lado)
    {
        super.color = color;
        this.lado = lado;
    }
    public float perimetro()
    {
        return 6*this.lado;
    }
    public float area()
    {
        return (3 * this.lado * this.lado * (float) (Math.sqrt(3))) / 2;
    }
    @Override
    public String toString()
    {
        return "Hexagono de color "+super.color+", col longitud de lado de"+this.lado
               +", con perimetro de "+this.perimetro()+"con area de "+this.area();
    }
}
