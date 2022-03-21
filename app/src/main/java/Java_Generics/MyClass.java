package Java_Generics;

class MyClass<T> {
    T object;
    public MyClass (T object){
            this.object = object;
    }

    public void print(){
        System.out.println(object);
    }
    
    @Override
    public String toString(){
        return object.toString();
    }


}