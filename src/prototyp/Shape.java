package prototyp;

public abstract class Shape implements Cloneable { // interfejs clonable
    protected String name;
    abstract void draw();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone(); // odpala kopiowanie pamieci (shallow copy nie deep copy)
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
class Circle extends Shape{

    public Circle() {
        this.name = "Circle";
    }

    @Override
    void draw() {
        System.out.println(this.name);
    }
}

class Square extends Shape{
    public Square() {
        this.name = "Square";
    }

    @Override
    void draw() {
        System.out.println(this.name);
    }
}


