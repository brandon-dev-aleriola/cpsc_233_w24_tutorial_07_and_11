public class GenericsDemo {
}

class ComparedGenericsDemo<T extends Comparable <T>> {
    // now our code can call compareTo
    // method on type T objects here
}
