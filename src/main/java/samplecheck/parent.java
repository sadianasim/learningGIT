package samplecheck;

public class parent {
    parent(int a){
        System.out.println("Inside integer parameterized parent constructor");
    }
    parent(){
        System.out.println("Inside non-parameterized parent constructor");
    }

    parent(String name){
        System.out.println("Inside string parameterized parent constructor");
    }
}

class child extends parent{
    child()
    {
        super();
        System.out.println("Inside non param Child constructor");

    }
    child(String n)
    {
        super("AMMU");
        System.out.println("Inside string Child constructor");

    }
    {
        System.out.println("Inside Instance initializer block");
    }

    public static void main(String args[]){
        child c1 = new child();
       // child c2 = new child("STR");
    }
}