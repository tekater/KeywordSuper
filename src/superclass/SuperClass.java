package superclass;

public class SuperClass{
    protected int field;
    protected int getField() {
        return field;
    }
    protected void printBaseValue() {
        System.out.println("field: " + field);
    }
}
