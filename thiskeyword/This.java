// this Keyword --> refers to the current object
// it reduce the confusion between current instances variable and parameter with same name
class Students{
    int id;
    Students(int id){
        this.id = id;
    }
    void display(){
        System.out.println(id);
    }
}
class This{
    public static void main(String[] args){
        Students s1 = new Students(123);
        s1.display();
    }
}