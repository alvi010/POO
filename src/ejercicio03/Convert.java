package ejercicio03;

public class Convert {

    public double numero1;

    public double numero2;

    public double numero3;

    public double numero4;


    public void establecerNumero1(double c)
    {
        numero1 = c;
    }

    public double obtenerNumero1()
    {
        return numero1;
    }

    public void establecerNumero2(double f)
    {
        numero2 = f;
    }

    public double obtenerNumero2()
    {
        return numero2;
    }
    public void establecerNumero3(double k)
    {
        numero3 = k;
    }

    public double obtenerNumero3()
    {
        return numero3;
    }

    public void establecerNumero4(double r)
    {
        numero2 = r;
    }

    public double obtenerNumero4()
    {
        return numero4;
    }

    public double operacionf()
    {
        double resultado;

        float obtenerNumero1 = 0;
        resultado = (9/5) * obtenerNumero1 + 32;

        return resultado;
    }

    public double operacionk()
    {
        double resultado;

        int obtenerNumero1 = 0;
        resultado = obtenerNumero1 + 273;

        return resultado;
    }

    public double operacionr()
    {
        double resultado;

        float obtenerNumero1 = 0;
        resultado = (9/5) * obtenerNumero1 + 492;

        return resultado;
    }

    public void mostrarOperacionf()
    {
        System.out.println(operacionf());
    }
}
