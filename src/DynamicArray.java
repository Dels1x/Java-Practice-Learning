import java.util.Arrays;

public class DynamicArray {

    private int size = 0;
    private int capacity = 10;
    private Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if(size >= capacity) grow();
        this.array[this.getSize()] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if(size >= capacity) grow();
        for(int i = size; i > index; i--) {
            this.array[i] = this.array[i-1];
        }
        this.array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for(int i = 0; i < getSize(); i++) {
            if (array[i] == data) {
                for(int j = 0; j < (size - i - 1); j++) {
                    array[i+j] = array[i+j+1];
                }
                this.array[this.getSize()-1] = null;
                size--;
                if(size <= (int) capacity / 3) shrink();
                break;
            }
        }
    }

    public int search(Object data) {
        for(int i = 0; i < this.getSize(); i++) {
            if(this.array[i] == data) return i;
        }
        return -1;
    }

    public void grow() {
        int newCapacity = getCapacity()*2;
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < getSize(); i++) {
            newArray[i] = array[i];
        }

        capacity = newCapacity;
        array = newArray;
    }

    public void shrink() {
        int newCapacity = getCapacity()/2;
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < getSize(); i++) {
            newArray[i] = array[i];
        }

        capacity = newCapacity;
        array = newArray;
    }

     public boolean isEmpty() {
        return size == 0;
     }

     public String toString() {
        String str = "[";
        for(Object i: this.array) {
            str = str.concat(String.valueOf(i).concat(", "));
        }
        if(str != "") {
            str = str.substring(0, str.length()-2);
        }
        return str.concat("]");
     }

    public int getCapacity() {
        return this.capacity;
    }

    public int getSize() {
        return this.size;
    }

}
