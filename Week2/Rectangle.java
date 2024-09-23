package Week2;

public class Rectangle {
    // attributes
    private float length ;
    private float width ;

    // constructors
    // 1. default constructor (only accessible when you dont have your own constructor defined)
    
    // 2. no argument constructor
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }
    
    // 3. parametrised constructor
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    } 

    //methods
    //had to do this because the attributes above are private, meaning unaccessible
    public float getLength(){
        return this.length;
    }
    public void setLength(float length){
        this.length = length;
    }
    
    public float getWidth(){
        return this.width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    
    public double getArea(){
        return(this.length * this.width);
    }

    public double getPerimeter(){
        return(this.length * 2) + (this.width * 2);
    }

    public String toString() {
        return ("Rectangle = (" + this.length + "," + this.width + ")");
    }
}
