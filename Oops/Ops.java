package Oops;

public class Ops {
    public static void main(String args[]){
         Pen p1 = new Pen();
        //  p1.setColor("blue");
        p1.setColor("yellow");
         System.out.println(p1.getColor());

         p1.setTip(5);
         System.out.println(p1.getTip());

 
        //  Bankaccount b1 = new Bankaccount();
        //  b1.username = "akshay_kumar";
        //  b1.setPassword("aki@123");
    }
}

// class Bankaccount{
//     public String username;//access modifier is public
//     private String password;//access modifier is private
//     public void setPassword(String newPassword){
//         password = newPassword;
//     }
// }
class Pen {
    String color;
    int tip;

    String getColor(){ //getter method
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){ //setter method
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy,int che,int math){
//         percentage = (phy + che + math) / 3;
//     }
// }
