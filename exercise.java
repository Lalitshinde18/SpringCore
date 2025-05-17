package Oops.java;


   class cylinder{
    private int radius;
    private  int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
   }

    public class exercise {
    public static void main(String[] args) {

        cylinder mycylender =new cylinder();
        mycylender.setHeight(12);
        int h =mycylender.getHeight();
        System.out.println(mycylender.getHeight());
        mycylender.setRadius(9);
        System.out.println(mycylender.getRadius());


    }




}
