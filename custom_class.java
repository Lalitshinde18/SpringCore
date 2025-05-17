package Oops.java;



    class employee{
        int id;
        String name;
        public void printDetails(){

            System.out.println("My id is "+id);
            System.out.println("And my name is "+name);
        }
    }
public class custom_class {

    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee lalit=new employee();
        employee rahul= new employee();

        lalit.id=12;
        lalit.name="lalit Sunil Shinde";

        rahul.id =23;
        rahul.name="rahul";

        lalit.printDetails();
        rahul.printDetails();

    }

}
