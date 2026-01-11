
class Students{
    int id;
    String name;
    void display(){
        System.out.println("id "+id+"name " +name);
    }
}
class Ex1{
    public static void main(String[] args){
        Students s1 = new Students();
        s1.id = 224026;
        s1.name = "Mohammed Abuthahir";
        s1.display();
        Students s2 = new Students();
        s2.id = 224010;
        s2.name = "Madesh";
        s2.display();
    }
}