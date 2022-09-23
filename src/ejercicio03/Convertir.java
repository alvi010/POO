package ejercicio03;

public class Convertir {

        double F;
        double C;

        double k;

        void establecerC(Double numC)
        {
            C = numC;
        }
        double obtenerC()
        {
            return C;
        }
        void operacion ()
        {
            F=(obtenerC()*(9/5))+32;
            System.out.print(F);
        }

    void oper ()
    {
       // k=(obtenerC() + 273;
        //System.out.print(k);
    }

}
