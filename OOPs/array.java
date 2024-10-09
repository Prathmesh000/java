import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        array a = new array();
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(8);
        System.out.println(a);
    }
    private int[] arr;
    int Default = 10;
    int size = 0;

    public array(){
        this.arr = new int[Default];
    }

    public void add(int n){
        if(isFull()){
            resize();
        }
        else{
            arr[size] = n;
            size++;
        }
    }

    private void resize() {
        int[] temp = new int[arr.length * 2];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return size == arr.length;
    }
    public String toString(){
        return Arrays.toString(arr);
    }
}
