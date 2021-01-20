public class TriangleClassifier{
    public static String TriangleClass(Triangle t){
        if (t.size_one<=0||t.size_two<=0||t.size_three<=0){
            return "not a triangle";
        }else if (t.size_one==t.size_two&& t.size_one==t.size_three){
            return "equilateral triangle";
        } else if (t.size_one == t.size_two
                ||t.size_two == t.size_three
                ||t.size_three==t.size_one){
            return "isosceles triangle";
        }else if (t.size_one>=t.size_two+t.size_three
                ||t.size_two>=t.size_one+t.size_three
                ||t.size_three>=t.size_one+t.size_two){
            return "not a triangle";
        }
        else return "triangles often";
    }

}
