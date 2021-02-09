package DataSturcturesAndAlgorithms;

public class ArraySolution {
    private int[] items;
    private int count;
    public ArraySolution(int length){
        items = new int[length];
    }

    public void print(){
        for (int i = 0; i<count; i++)
            System.out.println(items[i]);
    }
    public void insert(int item){
        //if the array is full, rezise it
        if (items.length == count){
            //create a new array (twice the size)
            int[] newItems = new int[count * 2];
            //copy all the exiting item
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            //set "items" to this new array
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        //validate index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        //shift the item to the left to fill hole
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }
    public int indexOf(int item) {
        //if we find it, return index
        //otherwise return  -1;
        //O(n)
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }
}
