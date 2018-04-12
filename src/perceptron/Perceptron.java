
package perceptron;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miguel Angel Cotrina Espinoza
 * Universidad Tecnologica del Peru
 * Correo: 0820832@utp.edu.pe
 */
public class Perceptron {

    
    public static void main(String[] args) {

        /*
            NEURONA CREADA CON VALORES PREDIFINIDOS
        */
        //Creamos los valores de ejemplo para un OR
            List<Double> valoresX = new ArrayList<>();valoresX.add(1.0);valoresX.add(1.0);
            List<Double> valoresW = new ArrayList<>();valoresW.add(1.2889320280105174);valoresW.add(0.8934602762111035);
        //Creamos una neurona de tamaño 2
            Neuron neurona1 = new Neuron(2);
        //Cargamos los valores de prueba
            neurona1.setX(valoresX);
            neurona1.setW(valoresW);
            neurona1.setPolarizacion(-0.5898267090268952);
        //Mostramos el contenido y la salida
            System.out.println(neurona1.toString());
            System.out.println(neurona1.sinapsis());
        
        /*
            NEURONA ENTRENADA 
        */
        //valores esperados OR
            List<Double> valoresEsperadoOR = new ArrayList<>();
            valoresEsperadoOR.add(0.0);
            valoresEsperadoOR.add(1.0);
            valoresEsperadoOR.add(1.0);
            valoresEsperadoOR.add(1.0);
        //valores esperados AND
            List<Double> valoresEsperadoAND = new ArrayList<>();
            valoresEsperadoAND.add(0.0);
            valoresEsperadoAND.add(1.0);
            valoresEsperadoAND.add(1.0);
            valoresEsperadoAND.add(1.0);    
        //Todos los valores de entrada
            List<Double> entrada1 = new ArrayList<>();entrada1.add(0.0); entrada1.add(0.0);
            List<Double> entrada2 = new ArrayList<>();entrada2.add(0.0); entrada2.add(1.0);
            List<Double> entrada3 = new ArrayList<>();entrada3.add(1.0); entrada3.add(0.0);
            List<Double> entrada4 = new ArrayList<>();entrada4.add(1.0); entrada4.add(1.0);
            List<List<Double>> entrada = new ArrayList<>();entrada.add(entrada1);entrada.add(entrada2);entrada.add(entrada3);entrada.add(entrada4);

        //Creamos al entrenador
            Trainer trainer = new Trainer();
        //Creamos la neurona tamaño 2
            Neuron neurona2 = new Neuron(2);
        //Entrenamos la neurona
            neurona2 = trainer.train(neurona2, entrada, valoresEsperadoOR);
        //Cargamos los valores de prueba
            List<Double> valoresX1 = new ArrayList<>();
            valoresX1.add(1.0);
            valoresX1.add(1.0);
            neurona2.setX(valoresX1);
        //Mostramos la salida
        System.out.println(neurona2.toString());
        System.out.println(neurona2.sinapsis());
    }
    
}
