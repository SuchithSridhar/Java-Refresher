// Refer to CS1083 assignment 3 for specific
class Generics<T extends Comparable<T>>{
    public T linearSearch(T[] list, T target){
        // Do operations here
        // Can use 'compareTo' w/o
        // casting since T extends comparable
        return target;
    }
}

class GenericsAlt<T>{
    public Comparable<T> linearSearch(Comparable<T>[] list){
        // Do operations
        // Have to cast items in array to
        // type T and 
        // (T) list[min]
        return list[0];
    }
}
