/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {

    public int suma(int num1, int num2) {
        //metodo para crear una suma
        //TODO se deberia hacer el return  de la suma return num1+num2
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }

    public int resta(int num1, int num2) {
        //metodo para crear la resta
        //TODO se deberia hacer el return  de la suma return num1+num2
        int resul = 0;
        resul = num1 - num2;
        return resul;
    }

    public int multipli(int num1, int num2) {
        //metodo para crear la multiplicacion
        int resul = 0;
        //TODO se deberia hacer el return  de la suma return num1+num2
        resul = num1 * num2;
        return resul;
    }

    public double divi(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
        //Se deberia validar que el num2 sea diferente de 0 para que no de Division por 0 y retornar de una sola
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }


}
