package superclass;

public class SubClass extends SuperClass{
    protected int field;

    public SubClass() {
        this.field = 30;  // инициализирует поле field
        field = 30;       // тоже инициализирует поле field класса SubClass
        super.field = 20; // инициализирует поле field класса SuperClass
    }

    public void printSubValue() {
        super.printBaseValue(); // вызывает метод родительского класса
                                // SuperClass printBaseValue();
        System.out.println("field: " + field);
    }

}
