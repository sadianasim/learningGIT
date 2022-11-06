package samplecheck;
 class animal {
     void walk() {
         System.out.println("animal walking");
     }
 }
 class cat extends animal{
     void walk()
     {
         System.out.println("cat talking");
     }
 }
class dog extends cat{
    @Override
    void walk() {
        System.out.println("dog talking");
    }
    public static void main (String args[])
    {
        animal ai = new dog();
        ai.walk();
        animal a2 = new dog();
        a2.walk(); // newly added
        System.out.println("Updating from StreamOwner");
    }
}


