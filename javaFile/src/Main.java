public class Main {


    public static void main(String[] args)
    {
Person P1=new Person("Shimu",23);
Person P2=new Person();
Person P3=new Person();
P2.setName("shin");
P2.setAge(12);
P3.setName("Shishir");
P3.setAge(27);
P1.display();
P2.display();
        System.out.println("Name : "+P2.getName());
        System.out.println("Age : "+P2.getAge());
        P3.display();

    }
}