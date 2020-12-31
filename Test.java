public class Test {
    public static void main(String[] args) {
        Wall wall1 = new Wall(25.0,20.0);   //with parameters
        Wall wall2 = new Wall();    //without parameters - default value
        Wall wall3 = new Wall();    //with setters-getters
        wall3.setHeight(10.5);
        wall3.setWidth(33.0);

        System.out.println("-----WALL ONE-----");
        System.out.println("Wall 1 Width : ");
        System.out.println(wall1.getWidth());
        System.out.println("Wall 1 Height : ");
        System.out.println(wall1.getHeight());
        System.out.println("Wall 1 Area : ");
        System.out.println(wall1.getArea());
        System.out.println("-----WALL TWO-----");
        System.out.println("Wall 2 Width : ");
        System.out.println(wall2.getWidth());
        System.out.println("Wall 2 Height : ");
        System.out.println(wall2.getHeight());
        System.out.println("Wall 2 Area : ");
        System.out.println(wall2.getArea());
        System.out.println("-----WALL THREE-----");
        System.out.println("Wall 3 Width : ");
        System.out.println(wall3.getWidth());
        System.out.println("Wall 3 Height : ");
        System.out.println(wall3.getHeight());
        System.out.println("Wall 3 Area : ");
        System.out.println(wall3.getArea());
        System.out.println();
    }
}
