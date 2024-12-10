public class MyClass {
    private int x;

    public MyClass(int x) {
        this.x = x; 
    }

    public void printX() {
        System.out.println(x); 
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        obj = null; 
        obj.printX(); //NullPointerException 
    }
}