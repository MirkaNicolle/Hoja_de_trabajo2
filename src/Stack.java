import java.util.ArrayList;

public class Stack<E> implements Pila<E> {

    //array encargado de almacenar variables
    protected ArrayList<E> stack = new ArrayList();

    //agrega un item al arreglo
    public void push (E item){
        this.stack.add(item);
    }

    //remueve el ultimo item del arreglo
    public E pop(){
        return this.stack.remove(stack.size()-1);
    }

    //devuelve el ultimo item del arreglo
    public E peek(){
        return this.stack.get(stack.size() -1);
    }

    //verifica si el stack esta vacio
    public boolean vacio(){
        if (stack != null){
            return false;
        }
        return true;
    }
}
