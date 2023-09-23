
class book {                            // class creation
    String color;
    String subject;

    public void books() {                //method creation
        System.out.println("This is book number 1");
    }

    public void colorPrint(){
        System.out.println(this.color);         //use of this
        System.out.println(this.subject);

    }
}


public class OOPS {
    public static void main (String[] args){

        book book1 = new book();            //object create
        book1.color ="red";
        book1.subject="physics";

        book book2 = new book();
        book2.color="brown";
        book2.subject = "chemistry";


        book1.books();
        book1.colorPrint();                //object call
        book2.colorPrint();





    }
}
