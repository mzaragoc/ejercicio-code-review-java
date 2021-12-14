
public class Utilitarios {
    //TODO la clase y el resto de metodos esta en espaniol
    public int average(int params[]) {
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }
    
    public double factorial(int numero) {
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }
    
    //El parametro deberia llamarse radio
    public double areaCirculo(double r) {
        //Todo se podria utilizar Math.PI
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //b = base ; h= altura
    //TODO si se pone los nombre en los parametros no haria falta comentarios
    public double areaTriangulo(double b, double h) {
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    public double calculoIva(double valor) {
        //TODO DEBERIA esta IVA en una clase constante o en 
        final int IVA = 12;
        //TODO 100 es una constante
        return (valor * IVA) / 100;
    }


}
