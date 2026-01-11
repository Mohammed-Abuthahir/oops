class User{
    String email;
    String name;

     User(String email,String name){
        this.email = email;
        this.name = name;
    }
    void display(){
        System.out.println("Email :"+email+" name :"+name);
    }
}
class Ex3{
    public static void main(String[] args){
        User u1 = new User("Mohammedabuthahi6@gmail.com" ,"abuthahir");
        u1.display();
    }
}