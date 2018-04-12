
package perceptron;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miguel Angel Cotrina Espinoza
 * Universidad Tecnologica del Peru
 * Correo: 0820832@utp.edu.pe
 */
public class Trainer {

    public Neuron train(Neuron neurona, List<List<Double>> entrada, List<Double> valorEsperado){
        double error=0;
        List<Double> w = new ArrayList<>();
        double polarizacion = -1+(Math.random()*(2));
        for(int i=0;i<neurona.cantidadEntradas();i++){
            w.add(-1+(Math.random()*(2)));
        }
        neurona.setW(w);
        neurona.setPolarizacion(polarizacion);
        
        for(int i=0;i<500;i++){
            for(int j=0;j<valorEsperado.size();j++){
                neurona.setX(entrada.get(j));
                error = valorEsperado.get(j) - neurona.sinapsis();
                neurona.setW(actualizarPesos(entrada.get(j),neurona.getW(),error));
                neurona.setPolarizacion(neurona.getPolarizacion()+error);
            }
        }
        return neurona;
    }
    private List<Double> actualizarPesos(List<Double> entrada, List<Double> wOriginal, double error ){
        List<Double> w = new ArrayList<>();
        for(int j=0; j<entrada.size();j++){
            w.add((error*entrada.get(j))+wOriginal.get(j)); 
        }
        return w;
    }
}
