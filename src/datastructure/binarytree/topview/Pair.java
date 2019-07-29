package datastructure.binarytree.topview;

 class Pair<U,V> {
     final  U first;
     final V second;


     Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }


    // Factory method for creating a Typed Pair immutable instance
     static <U,V> Pair<U,V> of(U a, V b) {
        return  new Pair<>(a,b);
    }
}
