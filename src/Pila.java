
//Inferfaz para la interacción del stack

public interface Pila<E> {

    //agrega un item al stack
    void push(E item);

    //presenta el item mas reciente y lo remueve
    E pop();

    //el item mas reciente es removido
    E peek();

    //true / false, stack vacio
    boolean vacio();
}
