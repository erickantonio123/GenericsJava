

import java.util.ArrayList;
import java.util.List;

public class genericos<T> {
    private List<T> elementos = new ArrayList<>();

public T addElemento(T elemento){
        elementos.add(elemento);
        return elemento;
    }


    public T mostrar(){
        for(T elemento: elementos){
            System.out.println("Mostrar elementos: " + elemento);
        }
        return null;
    }

    public T primeiroElemento(){
        if(elementos.isEmpty()){
            throw new IllegalStateException("A lista está vazia");
        }
        return elementos.get(0);
    }
}
