class JavaGenerics{

    public static void main (String args []){
        MyClass<Integer> object = new MyClass<>(23);
        object.print();
        MyClass<Double> doubleObject = new MyClass<>(9.5);
        doubleObject.print();

    }

    
}
    