package OOPs;
// 1, 2, 3, 4, 5, 6, 7, 8
public class CustomArrayList<T> {
    private Object[] data;
    private static int FINAL_SIZE=10;
    private int size = 0;
    CustomArrayList() {
        data = new Object[FINAL_SIZE];
    }

    public boolean fullSize() {
        if(size==FINAL_SIZE) {
            return true;
        }return false;
    }

    public void resize() {
        Object[] newArr = new Object[FINAL_SIZE*2];
        for(int i=0; i<size; i++) {
            newArr[i]=data[i];
        }
        data=newArr;
    }

    public void add(T element) {
        if(fullSize()) {
            resize();
        }
        data[size++]=element;
    }

    public void remove() {
        size--;
    }

    public void remove(int index) {
        int i = 0;
        while(i!=index) {
            i++;
        }
        for(int j=i; j<size-1; j++) {
            data[j]=data[j+1];
        }
        size--;
    }


    public int size() {
        return size;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> arr = new CustomArrayList();
        arr.add(12);
        arr.add(34);
        arr.add(51);
        arr.add(51);
        arr.add(51);
        arr.add(51);
        arr.add(51);
        arr.add(51);
        arr.add(51);
        arr.add(51);
        arr.add(19);
        arr.remove(0);
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
