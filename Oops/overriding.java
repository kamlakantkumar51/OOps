package Oops;

public class overriding {
    public static void main(String args[]){

        deer d = new deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println(":eating..");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("deer is eating grass");
    }
}