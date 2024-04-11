package Jashan;

public class InnerClasses
{
    static class Test
    {
        String name;
        public Test(String name)
        {
            this.name = name;
        }
        @Override
        public String toString()
        {
            return "name: " + name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Jashan"); //we are getting an error here cause test class is dependent upon the outerclass so an instance is needed to institate this class
        Test b = new Test("Hargun");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a); //calls the toString method in the class rather than the toString in the Printstream class

    }
}
