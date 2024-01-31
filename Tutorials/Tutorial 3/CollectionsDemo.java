import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

    public CollectionsDemo(){
    }
}
class ArrayListCollectionDemo{
    private List<String> list;

    public ArrayListCollectionDemo(){

        this.list = new ArrayList<>(20);
        list.add("Hello, ");
        list.add(" World!");
        list.add("Hello, ");
        list.add("Hello, ");
        // remove value at index of array list: list.remove(index);
        list.removeFirst();
    }

    public boolean get(){
        return this.list.isEmpty();
    }

    public void printMyList(){
        // print all of my values
    }

    public int printSearchedWordList(){
        // Iterator<> generic class can help
        // Collections calss can help for sorting
        // print the number of times a keyword is found
        return 0;
    }
}

