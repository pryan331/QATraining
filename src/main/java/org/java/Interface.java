package org.java;
//An interface in java is a blueprint of a class.
//the interface in java is a mechanism to achieve abstraction.
// there can be only abstract methods in java interface.
//it is used to achieve multiple inheritance in java

//How to declare an interface??
//an interface is declared by using the interface keyword.
// it provides abstraction, means all the methods in an interface are declared with the empty body
//and all the fields are public static and final by default.
public class Interface {
    public static void main(String[] args) {
        Printable document = new Document("This is my resume");
        Printable image = new Image("/path/to/image/image.jpeg");
        image.print();
        document.print();
    }
}
interface Printable{
    void print();
}

class Document implements Printable{
    private String content;

    public Document(String content){

        this.content = content;
    }

    @Override
    public void print(){

        System.out.println("Printing a document: \n"+ content);
    }
}
class Image implements Printable{
    private String imagePath;
    public Image(String imagePath){

        this.imagePath = imagePath;
    }
    @Override
    public void print(){
        System.out.println("Printing image: "+ imagePath);
        //logic to send the image for printer via wifi..
    }
}
