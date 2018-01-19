public class LemonArrayList<E> {
    private final int INIT_SIZE = 16;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    //добавление элемента в список
    public void add(E element){
        if (pointer == array.length - 1)
            resize(array.length * 2); // увеличиваем массив в 2 раза если достигли граници
        array[pointer++] = element;
    }

    // вызов элемента по индексу
    public E get(int index){
        return (E) array[index];
    }

    // возвращаем количество элементов списка
    public int size(){
        return pointer;
    }

    //Удаление элемента
    public void remove(int index){
        for (int i = index; i < pointer; i++){
            array[i] = array[i+1];
            array[pointer] = null;
            pointer--;
        }
    }

    //Воспомагательный метод для масштабирования массива
    private void resize(int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(array,0, newArray, 0, pointer);
        array = newArray;
    }

}
