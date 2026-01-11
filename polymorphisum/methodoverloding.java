// compiletime polymorphisum -- > Multiple method Have a Same name But Different Parameter is c
// called Method overloding

class calculator{
    int add(int a,int b){
        return a + b;
    }
    int add (int a,int b,int c){
        return a + b + c;
    }
    int add(int a,int b,int c,int d){
        return a + b + c + d;
    }
}
class methodoverloding{
    public static void main(String[] args){
        calculator c = new calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,4,5));
        System.out.println(c.add(2,4,5,8));
    }
}