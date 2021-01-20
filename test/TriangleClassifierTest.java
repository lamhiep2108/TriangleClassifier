import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {
    @Test
    public void triangleTest1(){
       Triangle triangle1 = new Triangle(2,2,2);
       String expected = "equilateral triangle";
       String result= TriangleClassifier.TriangleClass(triangle1);
       assertEquals(expected,result);
    }
    @Test
    public void triangleTest3(){
        Triangle triangle3 = new Triangle(3,4,5);
        String expected = "triangles often";
        String result= TriangleClassifier.TriangleClass(triangle3);
        assertEquals(expected,result);
    }
    @Test
    public void triangleTest4(){
        Triangle triangle4 = new Triangle(8,2,3);
        String expected = "not a triangle";
        String result= TriangleClassifier.TriangleClass(triangle4);
        assertEquals(expected,result);
    }
    @Test
    public void triangleTest5(){
        Triangle triangle5 = new Triangle(-1,2,1);
        String expected = "not a triangle";
        String result= TriangleClassifier.TriangleClass(triangle5);
        assertEquals(expected,result);
    }
    @Test
    public void triangleTest6(){
        Triangle triangle6 = new Triangle(0,1,1);
        String expected = "not a triangle";
        String result= TriangleClassifier.TriangleClass(triangle6);
        assertEquals(expected,result);
    }
    @Test
    public void triangleTest7(){
        Triangle triangle1 = new Triangle(2,2,3);
        String expected =  "isosceles triangle";
        String result= TriangleClassifier.TriangleClass(triangle1);
        assertEquals(expected,result);
    }
}