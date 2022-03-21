package Java_Generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;

class MyClassTest {
        @Test
        void testInteger() {
            MyClass<Integer> testClass = new MyClass<>(7);
            assertTrue("7".equals(testClass.toString()));
        }
        @Test 
        void testDouble(){
            MyClass<Double> testClass2 = new MyClass<>(12.5);
            assertTrue("12.5".equals(testClass2.toString()));
        }
    
}