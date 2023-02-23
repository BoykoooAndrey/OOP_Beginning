import java.util.Iterator;

public class newList<E> implements Iterable<E> {

    private static int size = 0;
    private Node<E> newNode = null;

    public newList() {
        newNode = new Node<>();
        System.out.println("Лист создан");
    }

    void add(E item) {
        if (size == 0) {
            newNode.setItem(item, size);
            size++;
            System.out.println("Элемент добавлен");
        } else {
            newNode.add(item, size, newNode);
            size++;
        }

    }

    public E get(int index) {
        if (size == 0) {
            System.out.println("Список пуст");
            return null;
        } 
        else if(index > size){
            System.out.printf("index out of range ");
            return null;
        }
        else {
            return newNode.getSearchItem(index);
        }
    }


    private static class Node<E> {
        private E item;
        private Node<E> next;
        private Node<E> prev;
        int index;
        private E searchItem;

        public Node() {
        }
        Node(Node<E> prev, E item, Node<E> next, int index) {
            this.item = item;
            this.next = next;
            this.prev = prev;
            this.index = index;
            this.searchItem = item;

        }
        void add(E item, int index, Node<E> n) {
            if (hasNext()) {
                next.add(item, index, n);
            } else {
                next = new Node<>(n, item, null, index);
            }
        }
        private E getSearchItem(int index){
            if (hasNext()) {
                if (!(next.index == index)) {
                    next.getSearchItem(index);
                }
            }
            this.searchItem = next.searchItem;
            return searchItem;
        }
        boolean hasNext() {
            return next != null;
        }
        private void setItem(E item, int index) {
            this.item = item;
            this.next = null;
            this.index = index;
        }
        E get(){
            return item;
        }
    }

    public static int getSize() {
        return size;
    }

private class myListItterator implements Iterator<E>{

    private Node<E> tmpNode;

    private boolean isFirst = true;

    myListItterator(Node<E> n){
        tmpNode = n;
    }
    
    @Override
    public boolean hasNext() {
        if (size == 1 && isFirst) { return true;
        
        }
        return tmpNode.hasNext();
    }

    @Override
    public E next() {
        if (isFirst) {
            isFirst = false;
        }
        else{
            tmpNode = tmpNode.next;
        }
        return tmpNode.get();
    }
    









}

    @Override
    public Iterator<E> iterator() {
        return new myListItterator(newNode);
    }

}
